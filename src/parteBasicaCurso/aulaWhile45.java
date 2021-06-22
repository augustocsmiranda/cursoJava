package parteBasicaCurso;

import java.util.Scanner;

public class aulaWhile45 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = 10;
        int soma = 0;

        while (x != 0) {
            System.out.println("Insira o número: ");
            x = sc.nextInt();
            soma += x;
            System.out.printf("Número Digitado: %d%n", x);
        }
        System.out.println("Soma dos números: " + soma);
        sc.close();
    }
}
