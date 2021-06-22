package aplication;

import java.util.Scanner;

public class aula99Exercicio {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        //Criação da Matrix M x N de números inteiros
        int [][] mat = new int[n][n];

        for (int i = 0; i < mat.length; i++){ // qtd de linha no lugar do n coloca mat.length
            for(int j = 0; j < mat[i].length; j++){ // qtd de colunas no lugar do n mat[i].length
                mat[i][j] = sc.nextInt();
            }
        }
        //Imprimir na diagonal MAIN
        System.out.println("Main diagonal: ");

        for(int i=0 ; i < mat.length ; i++){
            System.out.print(mat[i][i]+ " ");
        }
        int count = 0;
        for (int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                if(mat[i][j] < 0){
                    count++;
                }
            }
        }
        System.out.println("");
        System.out.println("Negative Numbers: "+ count);
        sc.close();
    }
}
