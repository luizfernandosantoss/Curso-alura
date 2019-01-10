import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import br.com.jpa.modelo.Categoria;
import br.com.jpa.modelo.Conta;
import br.com.jpa.modelo.Movimentacao;
import br.com.jpa.modelo.TipoMovimentacao;
import br.com.jpa.util.JPAUtil;

public class TesteCategoria {

    public static void main(String[] args) {

        Conta conta = new Conta();
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();
        conta = em.find(Conta.class,11);


        Categoria categoria1 = new Categoria("VIAGEM ");
        Categoria categoria2 = new Categoria("NEGOCIOS");

        Movimentacao movimentacao1 = new Movimentacao();
        movimentacao1.setCalendar(new Date());
        movimentacao1.setDescricao("VIAGEM A SÃO PAULO");
        movimentacao1.setTipo(TipoMovimentacao.SAIDA);
        movimentacao1.setValor(new BigDecimal("1000.00"));
        movimentacao1.setCategoria(Arrays.asList(categoria1,categoria2));

        movimentacao1.setConta(conta);


        Movimentacao movimentacao2 = new Movimentacao();
        movimentacao2.setCalendar(new Date());
        movimentacao2.setDescricao("VIAGEM PARA RJ");
        movimentacao2.setTipo(TipoMovimentacao.SAIDA);
        movimentacao2.setValor(new BigDecimal("800.00"));
        movimentacao2.setCategoria(Arrays.asList(categoria1,categoria2));


        movimentacao2.setConta(conta);




        em.persist(categoria1);
        em.persist(categoria2);

        em.persist(movimentacao1);
        em.persist(movimentacao2);

        em.getTransaction().commit();
        em.close();












    }
}
