package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

    public static void main(String[] args) {

        ArrayList<Conta> list = new ArrayList<Conta>();
        Conta cc = new ContaCorrente(9178,06533);
        list.add(cc);
        list.add(cc);

        Conta cc2 = new ContaCorrente(11111,23553);
        list.add(cc2);

        Conta cc3 = new ContaCorrente(9178,06533);
        list.add(cc3);

        Conta cc4 = new ContaCorrente(11111,23553);
        list.add(cc4);

        System.out.println(list.size());

        Conta ref = list.get(0);

        for (int i = 0; i < list.size() ; i++) {
            Object oRef = list.get(i);
            System.out.println(oRef);
        }

        for (Conta conta : list){
            System.out.println(conta);
        }





    }
}
