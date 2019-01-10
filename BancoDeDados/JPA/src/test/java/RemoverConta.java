import javax.persistence.EntityManager;
import br.com.jpa.modelo.Conta;
import br.com.jpa.util.JPAUtil;

public class RemoverConta {

    public static void main(String[] args) {

        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();

        Conta conta = new Conta();
        conta = em.find(Conta.class,2);

        System.out.println(conta);
        em.remove(conta);

        em.getTransaction().commit();
        em.close();


    }
}
