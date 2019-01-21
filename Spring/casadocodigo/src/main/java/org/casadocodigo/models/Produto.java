package org.casadocodigo.models;

import javax.persistence.*;
import java.lang.reflect.Array;
import java.util.List;

@Entity
public class Produto  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String titulo;
    private String descricao;
    private int paginas;
    //Adiciona o preço como parte do produto
    @ElementCollection
    private List<Preco> precos;



    @Override
    public String toString() {
        return "Produto{" + "titulo='" + titulo + '\'' + ", descricao='" + descricao + '\'' + ", paginas=" + paginas + '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getId() {
        return id;
    }



    public List<Preco> getPrecos() {
        return precos;
    }

    public void setPrecos(List<Preco> precos) {
        this.precos = precos;
    }

}



