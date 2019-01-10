import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.util.Date;
import br.com.jpa.modelo.Conta;
import br.com.jpa.modelo.Movimentacao;
import br.com.jpa.modelo.TipoMovimentacao;
import br.com.jpa.util.JPAUtil;

public class TesteMovimentacao {

    public static void main(String[] args) {


        Conta conta = new Conta();
        conta.setAgencia("123");
        conta.setBanco("DIGITAL");
        conta.setNumero("456");
        conta.setTitular("Uma Pessoa Qualquer");

        Movimentacao movimentacao = new Movimentacao();

        movimentacao.setDescricao("Churrascaria");
        movimentacao.setCalendar(new Date());
        movimentacao.setTipo(TipoMovimentacao.SAIDA);
        movimentacao.setValor(new BigDecimal("100.0"));

        movimentacao.setConta(conta);


        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();

        em.persist(conta);
        em.persist(movimentacao);

        em.getTransaction().commit();
        em.close();

    }
}
