package br.com.chatbot.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class HistoricoAssertividade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String perguntaUsuario;
    private String respostaBot;
    private String analiseHistorico;
    private Date data;




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
