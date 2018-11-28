package br.com.chatbot.util;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
    public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("analisebot");
    public EntityManager getEntityManager(){
        return emf.createEntityManager();
    }
}
