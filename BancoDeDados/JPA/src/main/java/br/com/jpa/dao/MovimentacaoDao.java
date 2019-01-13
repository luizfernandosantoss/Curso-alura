package br.com.jpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
import br.com.jpa.modelo.Conta;
import br.com.jpa.modelo.TipoMovimentacao;

public class MovimentacaoDao {

    private EntityManager em;

    public MovimentacaoDao(EntityManager em) {
        this.em = em;
    }

    public List<Double> mediasPorDiaETipo(Conta conta, TipoMovimentacao tipoMovimentacao){


        String jpql = "select avg (m.valor) from Movimentacao m where m.conta = :pConta"+
                " AND m.tipo = :pMovimentacao"+
                " group by day(m.calendar), month(m.calendar), year(m.calendar)";

        Query query = em.createQuery(jpql);
        query.setParameter("pConta",conta);
        query.setParameter("pMovimentacao", tipoMovimentacao);
        List<Double>  medias =  query.getResultList();

        return medias;
    }
}
