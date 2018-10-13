package br.com.bytebank.banco.test.util;

import javax.swing.text.StyledEditorKit.*;
import java.util.ArrayList;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

    public static void main(String[] args) {

//        Conta cc1 = new  ContaCorrente(22,22);
//        Conta cc2 = new ContaCorrente(22,223);
//
//        boolean igual = cc1.ehIgual(cc2);
//        System.out.println(igual);

        ArrayList<Conta> list = new ArrayList<Conta>();
        Conta cc = new ContaCorrente(9178,06533);
        list.add(cc);
        Conta cc2 = new ContaCorrente(9178,2132132);
        list.add(cc2);
        Conta cc3 = new ContaCorrente(9178,2132132);


        boolean existe = list.contains(cc3);

        System.out.println("ja Existe "+existe);

        for (Conta conta : list){
            if (conta.equals(cc3)){
                System.out.println("Eu ja tenho Essa Conta");
            }
            System.out.println(conta);
        }
        for (Conta conta : list){
            System.out.println(conta);
        }





    }
}
