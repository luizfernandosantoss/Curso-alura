import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
import br.com.jpa.modelo.Categoria;
import br.com.jpa.modelo.Movimentacao;
import br.com.jpa.util.JPAUtil;

public class TesteBuscarMovimentacaoPorCategoriaJPQL {

    public static void main(String[] args) {


        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();

        Categoria categoria = new Categoria();
        categoria.setId(6);


        String jpql = "select m from Movimentacao m join m.categoria c where c = :pCategoria";
        Query query = em.createQuery(jpql);
        query.setParameter("pCategoria", categoria);
        List<Movimentacao> resultado = query.getResultList();

        for (Movimentacao movimentacao:resultado){
            System.out.println("Descrição " +movimentacao.getDescricao());
            System.out.println("Get tipo "+ movimentacao.getTipo());
        }


        em.getTransaction().commit();
        em.close();

    }
}

