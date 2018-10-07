package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;


public class TesteSaca {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente(9178,62353);
        System.out.println(conta.getNumero());
        conta.deposita(200);
        try {
            conta.saca(250);
        }catch (SaldoInsuficienteException e){
            System.out.println(e.getMessage());
        }
        System.out.println(conta.getSaldo());


    }
}
