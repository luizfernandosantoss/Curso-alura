import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;
import br.com.jpa.dao.MovimentacaoDao;
import br.com.jpa.modelo.Conta;
import br.com.jpa.modelo.TipoMovimentacao;
import br.com.jpa.util.JPAUtil;

public class TesteFuncoesJPQL {

    public static void main(String[] args) {


        Conta conta = new Conta();
        conta.setId(11);


        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();

        TypedQuery<Double> typedQuery  =  em.createNamedQuery("mediasPorDiaETipo",Double.class);
        typedQuery.setParameter("pConta",conta);
        typedQuery.setParameter("pTipo",TipoMovimentacao.ENTRADA);

        List<Double> medias = typedQuery.getResultList();

        System.out.println("A media dos valores da movimentações e "+medias);
        int cont = 1;
        for (Double media:medias){
            System.out.println("media do "+cont+" dia "+media);
            cont++;
        }


        em.close();

    }
}
