package br.com.fernando;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformanceHash {

    public static void main(String[] args) {

        Collection<Integer> numeros = new HashSet<>();

        long inicio = System.currentTimeMillis();

        for (int i = 1; i <= 5000000; i++) {
            numeros.add(i);
        }

        for (Integer numero : numeros) {
            numeros.contains(numero);
        }

        long fim = System.currentTimeMillis();

        long tempoDeExecucao = fim - inicio;

        System.out.println("Tempo gasto: " + tempoDeExecucao);

    }

}