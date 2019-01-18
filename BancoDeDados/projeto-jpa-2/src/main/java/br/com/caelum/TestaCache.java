package br.com.caelum;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import br.com.caelum.model.Produto;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestaCache {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(JpaConfigurator.class);
        EntityManagerFactory entityManagerFactory = ctx.getBean(EntityManagerFactory.class);

        EntityManager em = entityManagerFactory.createEntityManager();
        Produto produto = em.find(Produto.class,1);

        em.close();
    }
}
