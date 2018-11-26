package br.com.chatbot.entidades;

import java.util.Date;

public class Empresa {

    private Integer id;
    private String nome;
    private Date dataAbertura;
    static Integer indice = 0;


    public Empresa(String nome, Date dataAbertura) {
        id = indice+1;
        indice++;
        this.nome = nome;
        this.dataAbertura = dataAbertura;
    }

    public Empresa(String nome) {
        id = indice+1;
        indice++;
        this.nome = nome;
        this.dataAbertura = new Date();
    }



    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Empresa: " + nome;
    }
}
