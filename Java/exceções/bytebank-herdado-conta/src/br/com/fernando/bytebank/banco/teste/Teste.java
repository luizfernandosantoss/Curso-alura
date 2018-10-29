package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class Teste {
    public static void main(String[] args) {

        GuardadorDeContas guardador = new GuardadorDeContas();

        Conta cc = new ContaCorrente (9178,06235-3);
        Conta cc2 = new ContaCorrente (9178,12345-3);
        Conta cc3 = new ContaCorrente (9178,12345-3);

        guardador.adiciona(cc);
        guardador.adiciona(cc2);
        guardador.adiciona(cc3);

        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);

        Conta ref = (Conta) guardador.getReferencia(0);
        System.out.println(ref.getNumero());

    }
}
