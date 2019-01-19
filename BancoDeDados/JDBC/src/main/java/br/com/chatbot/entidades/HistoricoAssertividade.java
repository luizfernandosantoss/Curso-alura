package br.com.chatbot.entidades;

import java.util.Date;

public class HistoricoAssertividade {

    private String perguntaUsuario;
    private String respostaBot;
    private String analiseHistorico;
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

    public String getAnaliseHistorico() {
        return analiseHistorico;
    }

    public void setAnaliseHistorico(String analiseHistorico) {
        this.analiseHistorico = analiseHistorico;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "HistoricoAssertividade{" + "perguntaUsuario='" + perguntaUsuario + '\'' + ", respostaBot='" + respostaBot + '\'' + ", analiseHistorico='" + analiseHistorico + '\'' + ", data=" + data + ", id=" + id + '}';
    }
}
