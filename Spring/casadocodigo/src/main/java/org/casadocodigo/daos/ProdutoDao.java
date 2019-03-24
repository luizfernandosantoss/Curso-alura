package org.casadocodigo.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import org.casadocodigo.models.Produto;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ProdutoDao {


    @PersistenceContext
    private EntityManager manager;

    public void gravar(Produto produto){
        System.out.println(produto);
        manager.persist(produto);
    }
    public List<Produto> listaProduto(){

        List<Produto> produtos = manager.createQuery("select p from Produto p", Produto.class).getResultList();
        return produtos;
    }

    public Produto buscarPorID(Integer id) {
        String jpql = "select distinct(p) from Produto p "
                    +"join fetch p.precos precos where p.id = :id";
        return  manager.createQuery(jpql,Produto.class)
                .setParameter("id",id)
                .getSingleResult();

    }
}
