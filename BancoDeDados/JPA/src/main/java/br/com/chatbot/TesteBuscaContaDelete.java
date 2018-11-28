package br.com.chatbot;

import javax.persistence.EntityManager;
import br.com.chatbot.entidades.HistoricoAssertividade;
import br.com.chatbot.util.JPAUtil;

public class TesteBuscaContaDelete {
    public static void main(String[] args) {

        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        HistoricoAssertividade historicoAssertividade = em.find(HistoricoAssertividade.class,1);
        em.remove(historicoAssertividade);
        em.getTransaction().commit();

        em.close();


    }
}
