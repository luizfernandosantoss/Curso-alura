import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.math.BigDecimal;
import java.util.List;
import br.com.jpa.modelo.Conta;
import br.com.jpa.modelo.Movimentacao;
import br.com.jpa.modelo.TipoMovimentacao;
import br.com.jpa.util.JPAUtil;

public class TesteFuncoesJPQL {

    public static void main(String[] args) {


        Conta conta = new Conta();
        conta.setId(11);


        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();

        String jpql = "select avg (m.valor) from Movimentacao m where m.conta = :pConta"+
                        " AND m.tipo = :pMovimentacao"+
                        " order by m.valor desc";
        Query query = em.createQuery(jpql);
        query.setParameter("pConta",conta);
        query.setParameter("pMovimentacao",TipoMovimentacao.SAIDA);
        Double  media = (Double) query.getSingleResult();

        System.out.println("A media dos valores da movimentações e "+media);


        em.getTransaction().commit();
        em.close();

    }
}
