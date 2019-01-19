import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
import br.com.jpa.modelo.Conta;
import br.com.jpa.util.JPAUtil;

public class TesteTodasAsMovimentacoesDasContas {
    public static void main(String[] args) {
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();

        String jpql = "select  distinct  c from Conta c left join fetch c.movimentacaos";

        Query query = em.createQuery(jpql);

        List<Conta> todasAsContas = query.getResultList();
        for(Conta conta:todasAsContas){
            System.out.println("Conta Titular: "+conta.getTitular());
            System.out.println("Conta Movimentações: ");
            System.out.println(conta.getMovimentacoes());
        }

        em.close();
    }
}
