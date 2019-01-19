import javax.persistence.EntityManager;
import br.com.jpa.modelo.Conta;
import br.com.jpa.modelo.Movimentacao;
import br.com.jpa.util.JPAUtil;

public class TesteMovimentaConta {
    public static void main(String[] args) {
        EntityManager em = new JPAUtil().getEntityManager();
        em.getTransaction().begin();

        Movimentacao movimentacao = em.find(Movimentacao.class,5);
        Conta conta = movimentacao.getConta();
        System.out.println(conta.getTitular());

        System.out.println("Quantidade de movimentações "+conta.getMovimentacoes().size());



        em.close();
    }
}
