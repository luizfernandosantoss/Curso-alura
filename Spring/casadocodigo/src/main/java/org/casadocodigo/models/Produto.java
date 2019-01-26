package org.casadocodigo.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Calendar;
import java.util.List;

@Entity
public class Produto  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String titulo;
    private String descricao;
    private int paginas;
    @DateTimeFormat
    private Calendar dataLancamento;
    private String sumarioPath;
    //Adiciona o preço como parte do produto
    @ElementCollection
    private List<Preco> precos;


    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", paginas=" + paginas +
                ", dataLancamento=" + dataLancamento +
                ", sumarioPath='" + sumarioPath + '\'' +
                ", precos=" + precos +
                '}';
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


    public Calendar getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Calendar dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public List<Preco> getPrecos() {
        return precos;
    }

    public void setPrecos(List<Preco> precos) {
        this.precos = precos;
    }

    public String getSumarioPath() {
        return sumarioPath;
    }

    public void setSumarioPath(String sumarioPath) {
        this.sumarioPath = sumarioPath;
    }
}


