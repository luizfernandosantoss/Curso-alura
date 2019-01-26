package org.casadocodigo.controllers;

import org.casadocodigo.daos.ProdutoDao;
import org.casadocodigo.models.CarrinhoCompras;
import org.casadocodigo.models.CarrinhoItem;
import org.casadocodigo.models.Produto;
import org.casadocodigo.models.TipoPreco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/carrinho")
public class CarrinhoCompraController {
    @Autowired
    ProdutoDao produtoDao;

    @Autowired
    private CarrinhoCompras carrinhoCompras;

    @RequestMapping (value = "/add",method = RequestMethod.POST)
        public ModelAndView add(Integer produtoId, TipoPreco tipoPreco){
            ModelAndView modelAndView = new ModelAndView("redirect:/produtos");
            CarrinhoItem carrinhoItem = criaItem(produtoId,tipoPreco);
            carrinhoCompras.add(carrinhoItem);
            return modelAndView;
        }
        private CarrinhoItem criaItem(Integer produtoId,TipoPreco tipoPreco){
            Produto produto = produtoDao.buscarPorID(produtoId);
            CarrinhoItem carrinhoItem = new CarrinhoItem(produto,tipoPreco);
            return carrinhoItem;
        }
}
