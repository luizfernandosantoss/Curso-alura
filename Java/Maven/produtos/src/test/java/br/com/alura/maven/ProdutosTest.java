package br.com.alura.maven;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProdutosTest {
    @Test
    public void verificaPrecoComImposto(){
        Produtos bala = new Produtos("juquinha",0.10);
        assertEquals(0.11,bala.getPrecoComImposto(),0.00001);
    }
}
