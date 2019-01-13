import javax.persistence.EntityManager;
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

        MovimentacaoDao dao = new MovimentacaoDao(em);
        List<Double> medias = dao.mediasPorDiaETipo(conta,TipoMovimentacao.SAIDA);

        System.out.println("A media dos valores da movimentações e "+medias);
        int cont = 1;
        for (Double media:medias){
            System.out.println("media do "+cont+" dia "+media);
            cont++;
        }


        em.close();

    }
}
