package br.com.fernando;

import java.util.Objects;

public class Aluno {

    private String nome;
    private Integer matricula;

    public Aluno(String nome, Integer matricula) {
        if(nome == null){
            throw new NullPointerException("Nome não pode ser nulo");
        }
        this.nome = nome;
        this.matricula = matricula;
    }

    @Override
    public boolean equals(Object obj){
       Aluno outro = (Aluno) obj;
       return this.nome.equals(outro.nome);
     }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
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
