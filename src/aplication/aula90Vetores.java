package aplication;

import java.util.Scanner;

import entities.aula90Vet;

public class aula90Vetores {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        aula90Vet[] vect = new aula90Vet[n];

        for(int i = 0; i < n; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();

            vect[i] = new aula90Vet(name, price);

        }

        double soma = 0;

        //vect.length é melhor que usar o N para pegar o tamanho do Vetor
        for(int i = 0; i<vect.length;i++){
            soma += vect[i].getprice();
        }

        double media = soma / n;

        System.out.printf("AVERAGE PRICE: %.2f%n", media);
        sc.close();
    }
}
