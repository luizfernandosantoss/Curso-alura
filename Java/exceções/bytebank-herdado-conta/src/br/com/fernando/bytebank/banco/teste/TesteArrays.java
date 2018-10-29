package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrays {
    //Array
    public static void main(String[] args) {

        int[] idades = new int[5];

        for (int i = 0; i < idades.length ; i++) {
            idades[i] = i*i;
            System.out.println(idades[i]);
        }
        Conta[] contas = new Conta[5];
        ContaPoupanca cc1 = new ContaPoupanca(9178,06235-3);
        ContaCorrente cc2 = new ContaCorrente(9178,062544-3);

        contas[0] = cc1;
        contas[1] = cc2;

        ContaCorrente ref1 = (ContaCorrente) contas[1]; //type Cast
        Conta ref = contas[0];

        System.out.println(cc1.getAgencia());
        System.out.println(contas[0].getAgencia());

    }
}
