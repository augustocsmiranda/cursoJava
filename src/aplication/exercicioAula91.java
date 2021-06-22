/**A Dona de um pensionato possui dez quartos para alugar para estudantes,
sendo esses quartos identificados pelos numeros 0 - 9.

Fazer um programa que inicie com todos os 10 quaros varios, e depois leia uma quantidade N representandando
o numero de estudantes que vao alugar quartos (N pode ser de 1 a 10). Em Seguida, registre o aluguel dos N estudantes, 
bem como qual o dos quartos ele escolheu (de 0 a 9). Suponha que seja escolhido um uarto vago.
Ao final, seu programa deve imprimir um reletorio de todas as ocupaçoes do pensiuonato, por ordem de quarto, conforme exemplo.

 * / */
package aplication;

import java.util.Scanner;
//import java.util.jar.Attributes.Name;

import entities.rentedAula91;

public class exercicioAula91 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many rooms will be rented? ");

        int n = sc.nextInt();
        int y = 0;
        rentedAula91[] vect = new rentedAula91[9];

        for(int i = 0; i < n; i++){
            y++;
            sc.nextLine();
           
            System.out.println("Rent #"+y);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email:");
            String email = sc.nextLine();
            System.out.print("Room: ");
            vect[n] = new rentedAula91(name, email);
            sc.nextLine();
            System.out.println("");
        }
        System.out.println("Busy rooms: ");

        for (int i = 0; i < n; i++){
           // System.out.println("");
            System.out.println(vect[i]+": "+vect[i].getName()+", "+vect[i].getEmail());
        }
        sc.close();
    }
}
