package br.com.chatbot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;
import br.com.chatbot.entidades.HistoricoAssertividade;
import br.com.chatbot.util.JPAUtil;

public class TesteCadastrar {
    public static void main(String[] args) {

        HistoricoAssertividade historicoAssertividade = new HistoricoAssertividade();
        historicoAssertividade.setPerguntaUsuario("Teste");
        historicoAssertividade.setRespostaBot("Te3wte");
        historicoAssertividade.setAnaliseHistorico("Teste");
        historicoAssertividade.setData(new Date());

        EntityManager manager = new JPAUtil().getEntityManager();

        manager.getTransaction().begin();
        manager.persist(historicoAssertividade);
        historicoAssertividade.setRespostaBot("RECEBE Outra resposta");

        manager.getTransaction().commit();

        manager.close();
    }
}
