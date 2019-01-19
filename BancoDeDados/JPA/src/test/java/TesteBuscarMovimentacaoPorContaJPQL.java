import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import br.com.jpa.modelo.Conta;
import br.com.jpa.modelo.Movimentacao;
import br.com.jpa.modelo.TipoMovimentacao;
import br.com.jpa.util.JPAUtil;
import org.hibernate.hql.internal.QueryExecutionRequestException;

public class TesteBuscarMovimentacaoPorContaJPQL {

    public static void main(String[] args) {


        Conta conta = new Conta();
        conta.setId(11);


        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();

        String jpql = "select m from Movimentacao m where m.conta = :pConta"+
                        " AND m.tipo = :pMovimentacao";
        Query query = em.createQuery(jpql);
        query.setParameter("pConta",conta);
        query.setParameter("pMovimentacao",TipoMovimentacao.ENTRADA);
        List<Movimentacao> resultado = query.getResultList();

        for (Movimentacao movimentacao:resultado){
            System.out.println("Descrição " +movimentacao.getDescricao());
            System.out.println("Get tipo "+ movimentacao.getTipo());
        }


        em.getTransaction().commit();
        em.close();

    }
}
