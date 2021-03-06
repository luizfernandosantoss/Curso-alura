package br.com.jpa.modelo;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

@Entity
@NamedQuery(query ="select avg (m.valor) from Movimentacao m where m.conta = :pConta"+
        " AND m.tipo = :pTipo"+
        " group by day(m.calendar), month(m.calendar), year(m.calendar)",name = "mediasPorDiaETipo")
public class Movimentacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private BigDecimal valor;

    @Enumerated(EnumType.STRING)
    private TipoMovimentacao tipo;

    @Temporal(TemporalType.TIMESTAMP)
    private Calendar calendar;

    private String descricao;

    @ManyToOne
    private Conta conta;

    @ManyToMany
    private List<Categoria> categoria;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public TipoMovimentacao getTipo() {
        return tipo;
    }

    public void setTipo(TipoMovimentacao tipo) {
        this.tipo = tipo;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public List<Categoria> getCategoria() {
        return categoria;
    }

    public void setCategoria(List<Categoria> categoria) {
        this.categoria = categoria;
    }
}
