import javax.persistence.EntityManager;
import br.com.jpa.modelo.Conta;
import br.com.jpa.util.JPAUtil;

public class TesteConta {

    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.setTitular("Luiz Fernando Santos");
        conta.setAgencia("123");
        conta.setNumero("456");
        conta.setBanco("ITAU");

        EntityManager em = new JPAUtil().getEntityManager();


        em.getTransaction().begin();

        em.persist(conta);

        em.getTransaction().commit();

        em.close();
    }
}
