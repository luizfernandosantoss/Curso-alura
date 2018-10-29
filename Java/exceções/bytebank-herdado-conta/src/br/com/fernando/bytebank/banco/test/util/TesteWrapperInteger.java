package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {
    public static void main(String[] args) {

        Integer idadeRef = Integer.valueOf(29);
        System.out.println(idadeRef.doubleValue());

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);

        Boolean dref = Boolean.FALSE;

        int valor = idadeRef.intValue();//unboxing
        String s = args[0];

        int numero = Integer.parseInt(s);
        System.out.println(numero);

        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(numero);//Autoboxing



    }
}
