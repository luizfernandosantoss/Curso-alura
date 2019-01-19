import javax.persistence.EntityManager;
import br.com.jpa.modelo.Conta;
import br.com.jpa.util.JPAUtil;

public class TesteBuscaConta {
    public static void main(String[] args) {
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();

        Conta conta = em.find(Conta.class,2);

        System.out.println(conta);

        conta.setAgencia("9178");

        em.getTransaction().commit();
        em.close();

        EntityManager em2 = new JPAUtil().getEntityManager();
        em2.getTransaction().begin();
        conta.setAgencia("Bradesco");
        //utilizar merge para conta voltar a sincronizar com banco de dados
        em2.merge(conta);
        em2.getTransaction().commit();
        em2.close();
    }
}
