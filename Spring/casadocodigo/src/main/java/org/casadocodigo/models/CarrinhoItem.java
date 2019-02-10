package org.casadocodigo.models;

import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class CarrinhoItem implements Serializable {
    private static final long serialVersionUID = 1L;

    @Autowired
    private Produto produto;
    @Autowired
    private TipoPreco tipoPreco;


    public CarrinhoItem(Produto produto, TipoPreco tipoPreco) {
        this.produto =produto;
        this.tipoPreco = tipoPreco;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public TipoPreco getTipoPreco() {
        return tipoPreco;
    }

    public void setTipoPreco(TipoPreco tipoPreco) {
        this.tipoPreco = tipoPreco;
    }
    public BigDecimal getPreco(){
        return produto.precoPara(tipoPreco);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarrinhoItem that = (CarrinhoItem) o;
        return produto.equals(that.produto) &&
                tipoPreco == that.tipoPreco;
    }

    @Override
    public int hashCode() {
        return Objects.hash(produto, tipoPreco);
    }

    public BigDecimal getTotal(Integer quantidade) {
        return this.getPreco().multiply(new BigDecimal(quantidade));
    }
}
