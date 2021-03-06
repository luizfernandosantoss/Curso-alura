package org.casadocodigo.controllers;

import org.casadocodigo.daos.ProdutoDao;
import org.casadocodigo.infra.FileSaver;
import org.casadocodigo.models.Produto;
import org.casadocodigo.models.TipoPreco;
import org.casadocodigo.validation.ProdutoValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/produtos")
public class ProdutosController {

    @Autowired
    private ProdutoDao produtoDao;

    @Autowired
    private FileSaver fileSaver;

    @InitBinder
    public void iniBinder(WebDataBinder binder){
        binder.addValidators(new ProdutoValidation());

    }

    @RequestMapping("/form")
    public ModelAndView form(Produto produto){
        ModelAndView modelAndView = new ModelAndView("produtos/form");
        modelAndView.addObject("tipos",TipoPreco.values());
        return modelAndView;
    }

    @RequestMapping(method=RequestMethod.POST)
    public ModelAndView gravar(MultipartFile sumario, @Valid Produto produto,
                               BindingResult result, RedirectAttributes redirectAttributes) {

        if(result.hasErrors()) {
            return form(produto);
        }

        String path = fileSaver.write("arquivos-sumario", sumario);
        produto.setSumarioPath(path);

        produtoDao.gravar(produto);

        redirectAttributes.addFlashAttribute("sucesso", "Produto cadastrado com sucesso!");

        return new ModelAndView("redirect:produtos");
    }

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView lista(){
        ModelAndView modelAndView= new ModelAndView("produtos/lista");
        List<Produto> produtos = produtoDao.listaProduto();
        modelAndView.addObject("produtos", produtos);
        return modelAndView;

    }
    @RequestMapping("/detalhes/{id}")
    public ModelAndView detalhes(@PathVariable("id") Integer id){
        ModelAndView modelAndView = new ModelAndView("produtos/detalhes");
        Produto produto = produtoDao.buscarPorID(id);
        modelAndView.addObject("produto",produto);
        return modelAndView;
    }


}
