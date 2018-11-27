package br.com.chatbot;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;
import br.com.chatbot.entidades.HistoricoAssertividade;

public class TesteCadastrar {
    public static void main(String[] args) {

        HistoricoAssertividade historicoAssertividade = new HistoricoAssertividade();
        historicoAssertividade.setPerguntaUsuario("Teste");
        historicoAssertividade.setRespostaBot("Te3wte");
        historicoAssertividade.setAnaliseHistorico("Teste");
        historicoAssertividade.setData(new Date());

        EntityManagerFactory emf =  Persistence.createEntityManagerFactory("analisebot");
        EntityManager em = emf.createEntityManager();


        em.getTransaction().begin();
        em.persist(historicoAssertividade);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
