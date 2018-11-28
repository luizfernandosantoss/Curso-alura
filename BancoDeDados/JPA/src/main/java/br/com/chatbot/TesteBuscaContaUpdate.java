package br.com.chatbot;

import javax.persistence.EntityManager;
import br.com.chatbot.entidades.HistoricoAssertividade;
import br.com.chatbot.util.JPAUtil;

public class TesteBuscaContaUpdate {
    public static void main(String[] args) {

        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        HistoricoAssertividade historicoAssertividade = em.find(HistoricoAssertividade.class,1);
        historicoAssertividade.setPerguntaUsuario("Teste update");
        em.getTransaction().commit();

        System.out.println(historicoAssertividade);
        em.close();

        EntityManager em2 = new JPAUtil().getEntityManager();
        em2.getTransaction().begin();
        historicoAssertividade.setRespostaBot("Alterando os dados");
        historicoAssertividade.setAnaliseHistorico("Alterando os dados");
        em2.merge(historicoAssertividade);
        em2.getTransaction().commit();
        em2.close();

    }
}
