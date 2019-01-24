package org.casadocodigo.controllers;

import javax.validation.Valid;
import java.util.List;
import org.casadocodigo.daos.ProdutoDao;
import org.casadocodigo.models.Produto;
import org.casadocodigo.models.TipoPreco;
import org.casadocodigo.validation.ProdutoValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ProdutosController {

    @Autowired
    private ProdutoDao produtoDao;

    @InitBinder
    public void iniBinder(WebDataBinder binder){
        binder.addValidators(new ProdutoValidation());

    }

    @RequestMapping("/produtos/form")
    public ModelAndView form(Produto produto){
        ModelAndView modelAndView = new ModelAndView("produtos/form");
        modelAndView.addObject("tipos",TipoPreco.values());
        return modelAndView;
    }

    @RequestMapping(method=RequestMethod.POST)
    public ModelAndView gravar(@Valid Produto produto, BindingResult result,
                               RedirectAttributes redirectAttributes) {

        if (result.hasErrors()) {
            return form(produto);
        }
        produtoDao.gravar(produto);
        redirectAttributes.addFlashAttribute("sucesso", "Produto cadastrado com sucesso!");
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
