package Exercicios;

import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

                int n = scanner.nextInt();
                System.out.println(n);
                if((n > 20 && n<100) ){
                    System.out.println("Not Weird\n");
                }if ((n >= 2 && n <=5) || (n >= 6 && n <= 20)){
                    System.out.println("Weird\n");
                }
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                scanner.close();
    }


}
