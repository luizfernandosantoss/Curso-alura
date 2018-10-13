package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {

    private  Object[]  referecias;
    private int posicaoLivre;

    public GuardadorDeContas(){
        this.referecias = new Conta[10];
        this.posicaoLivre = 0;
    }

    public void adiciona(Conta ref){
        this.referecias[posicaoLivre] = ref;
        posicaoLivre++;

    }

    public int getQuantidadeDeElementos() {
        return this.posicaoLivre;
    }

    public Object getReferencia(int pos) {
        return  this.referecias[pos];
    }
}
