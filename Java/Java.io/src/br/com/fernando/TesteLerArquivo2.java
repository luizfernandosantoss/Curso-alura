package br.com.fernando;

import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class TesteLerArquivo2 {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(new File("contas.csv"));

        while (scanner.hasNext()){
            String linha =scanner.nextLine();
            System.out.println(linha);
            Scanner linhaScanner = new Scanner(linha);
            linhaScanner.useLocale(Locale.US);
            linhaScanner.useDelimiter(",");

            String tipoConta = linhaScanner.next();
            int agencia = linhaScanner.nextInt();
            int conta = linhaScanner.nextInt();
            String titular = linhaScanner.next();
            Double saldo = linhaScanner.nextDouble();

            String valorFormatado = String.format("%s  %d  %d  %s  %.2f",tipoConta,agencia,conta,titular,saldo);
            System.out.println(valorFormatado);
            linhaScanner.close();

//            String[] valores = linha.split(",");
//            System.out.println(Arrays.toString(valores));

        }
        scanner.close();

    }
}
