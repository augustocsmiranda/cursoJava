package parteBasicaCurso;

import java.util.Scanner;

public class exercicioAula37 {
    public static void main(String[] args) throws Exception {
        // 1 - Fazer um programa para ler um número inteiro, e depois dizer se este
        // número é NEGATIVO ou não NÃO NEGATIVO.

        Scanner sc = new Scanner(System.in);

        /*
         * System.out.println("Insirao Número: ");
         * 
         * int x;
         * 
         * x = sc.nextInt();
         */

        /*
         * if (x < 0) { System.out.println("NEGATIVO"); } else {
         * System.out.println("NÃO NEGATIVO"); }
         */

        // 2 - Fazer um programa para ler um número inteiro e dizer se este número é par
        // ou ímpar.

        /*
         * if (x % 2 == 0) { System.out.println("PAR"); } else {
         * System.out.println("IMPAR"); }
         */

        // 3 - Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma
        // mensagem "Sao Multiplos" ou "Nao sao
        // Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os
        // números devem poder ser digitados em
        // ordem crescente ou decrescente.

        /*
         * int A, B;
         * 
         * System.out.println("Insira A e B: ");
         * 
         * A = sc.nextInt(); B = sc.nextInt();
         * 
         * if (A % B == 0 || B % A == 0) { System.out.println("São Multiplos"); } else {
         * System.out.println("Não são multiplos"); }
         */

        // 4 - Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração
        // do jogo, sabendo que o mesmo pode
        // começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e
        // máxima de 24 horas.

        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();

        int duracao;
        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

        sc.close();

    }
}