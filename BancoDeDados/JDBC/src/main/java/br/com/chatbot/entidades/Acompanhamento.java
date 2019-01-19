package br.com.chatbot.entidades;

import java.util.Date;

public class Acompanhamento {

    private String perguntaUsuario;
    private String respostaBot;
    private String analise;
    private Date data;
    private Integer id;



    public String getPerguntaUsuario() {
        return perguntaUsuario;
    }

    public void setPerguntaUsuario(String perguntaUsuario) {
        this.perguntaUsuario = perguntaUsuario;
    }

    public String getRespostaBot() {
        return respostaBot;
    }

    public void setRespostaBot(String respostaBot) {
        this.respostaBot = respostaBot;
    }

    public String getsAnalise() {
        return analise;
    }

    public void setAnalise(String analiseHistorico) {
        this.analise = analiseHistorico;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAnalise() {
        return analise;
    }
}
