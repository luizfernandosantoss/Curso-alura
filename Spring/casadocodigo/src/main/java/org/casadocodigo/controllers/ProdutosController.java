package org.casadocodigo.controllers;

import java.util.List;
import org.casadocodigo.daos.ProdutoDao;
import org.casadocodigo.models.Produto;
import org.casadocodigo.models.TipoPreco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ProdutosController {

    @Autowired
    private ProdutoDao produtoDao;

    @RequestMapping("/produtos/form")
    public ModelAndView form(){
        ModelAndView modelAndView = new ModelAndView("produtos/form");
        modelAndView.addObject("tipos",TipoPreco.values());
        return modelAndView;
    }

    @RequestMapping(value ="/produtos",method = RequestMethod.POST)
    //Adicionar o redirectAttibutes para redirecionar o atributos da pagina para outra
    public ModelAndView gravar(Produto produto, RedirectAttributes redirectAttributes){
        produtoDao.gravar(produto);
        redirectAttributes.addFlashAttribute("sucesso","Produto cadastrado com sucesso");
        return new ModelAndView("redirect:produtos");
    }

    @RequestMapping(value = "/produtos",method = RequestMethod.GET)
    public ModelAndView lista(){
        ModelAndView modelAndView= new ModelAndView("produtos/lista");
        List<Produto> produtos = produtoDao.listaProduto();
        System.out.println(produtos);
        modelAndView.addObject("produtos", produtos);
        return modelAndView;

    }

}
