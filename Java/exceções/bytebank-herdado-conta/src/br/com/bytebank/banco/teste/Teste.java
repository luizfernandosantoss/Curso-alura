package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class Teste {
    //Array
    public static void main(String[] args) {

        int[] idades = new int[5];

        for (int i = 0; i < idades.length ; i++) {
            idades[i] = i*i;
            System.out.println(idades[i]);
        }
        ContaCorrente[] contas = new ContaCorrente[5];
        ContaCorrente cc1 = new ContaCorrente(9178,06235-3);
        ContaCorrente cc2 = new ContaCorrente(9178,062544-3);

        contas[0] = cc1;
        contas[1] = cc2;

        System.out.println(cc1.getAgencia());
        System.out.println(contas[0].getAgencia());

    }
}
