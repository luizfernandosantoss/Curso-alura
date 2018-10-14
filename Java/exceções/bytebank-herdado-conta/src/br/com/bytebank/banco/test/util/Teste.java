package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class Teste {
    public static void main(String[] args) {

        ContaCorrente cc1 = new ContaCorrente(33,55);
        ContaCorrente cc2 = new ContaCorrente(33,33);
        ContaCorrente cc3 = new ContaCorrente(33,19);
        ContaCorrente cc4 = new ContaCorrente(33,10);

        List<Conta> lista = new ArrayList<Conta>();

        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        NumeroDaCOntaComparator comparator = new NumeroDaCOntaComparator();

        for (Conta conta: lista) {
            System.out.println(conta.getNumero());
        }
        lista.sort(comparator);
        System.out.println();
        for (Conta conta: lista) {
            System.out.println(conta.getNumero());
        }

    }
}


class NumeroDaCOntaComparator implements Comparator<Conta>{

    @Override
    public int compare(Conta c1, Conta c2) {
        if (c1.getNumero() < c2.getNumero()){
            return -1;
        }
        if (c1.getNumero() > c2.getNumero()){
            return 1;
        }
        return 0;
    }
}