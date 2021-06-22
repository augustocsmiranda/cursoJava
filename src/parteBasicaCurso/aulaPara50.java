package parteBasicaCurso;

import java.util.Scanner;

public class aulaPara50 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int soma = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            soma = soma + x;
        }

        System.out.println(soma);
        sc.close();
    }
}