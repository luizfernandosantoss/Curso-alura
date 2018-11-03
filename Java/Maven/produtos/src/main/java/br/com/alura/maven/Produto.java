package br.com.alura.maven;

public class Produto {
    private String nome;
    private Double preco;

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;

    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public double getPrecoComImposto() {
        return preco*1.10;
    }
}
