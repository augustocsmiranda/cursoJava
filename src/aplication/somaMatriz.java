package aplication;

import java.util.Scanner;

public class somaMatriz {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe [M x N]: ");

        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] matA = new int[m][n];

        System.out.println("Informe a primeira Tabela ["+ m + " x "+ n+ "].");

        for(int i = 0; i < matA.length; i++){
            
            for(int j = 0; j < matA[i].length; j++){
                
                matA[i][j] = sc.nextInt();
            }
        }

        int[][] matB= new int[m][n];

        System.out.println("Informe a Segunda Tabela ["+ m + " x "+ n+ "].");

        for(int i = 0; i < matB.length; i++){
            for(int j = 0; j < matB[i].length; j++){
                matB[i][j] = sc.nextInt();

            }
        }
        /*for(int i = 0; i < mat.length; i++){
            
            for(int j = 0; j < mat[i].length; j++){
                
                mat[i][j] = sc.nextInt();
            }
        }*/

        //soma de matrix
        int[][] matTotal = new int[m][n];
        System.out.println("");

        for(int i = 0; i < matTotal.length; i++){
            for(int j = 0; j < matTotal[i].length; j++){
                matTotal[i][j] = matA[i][j] * matB[i][j];
                System.out.print(matTotal[i][j]+" ");

            }
            System.out.println();
        }

        sc.close();
    }
}
