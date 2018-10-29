package br.com.fernando;

public class Aluno {

    private String nome;
    private Integer matricula;

    public Aluno(String nome, Integer matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }


    public String getAluno() {
        return nome;
    }

    public Integer getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Nome: "+nome+" Matricula: "+matricula;
    }
}
