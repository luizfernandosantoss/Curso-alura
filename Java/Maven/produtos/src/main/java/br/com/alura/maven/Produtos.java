package br.com.alura.maven;

public class Produtos {
    private String nome;
    private Double preco;

    public Produtos(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;

    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Produtos{" + "nome='" + nome + '\'' + ", preco=" + preco + '}';
    }

    public double getPrecoComImposto() {
        return preco*1.10;
    }
}
