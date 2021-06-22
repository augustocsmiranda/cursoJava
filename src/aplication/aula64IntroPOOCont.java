package aplication;

import java.util.Scanner;

import entities.aula64Triangle;

public class aula64IntroPOOCont {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        aula64Triangle x, y;

        x = new aula64Triangle();
        y = new aula64Triangle();

        System.out.println("Enter The Measures of Triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter The Measures of Triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();

        double areaY = y.area();

        System.out.printf("Triangle X Area: %.4f%n", areaX);
        System.out.printf("Triangle Y Area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger Area: Y");
        }
        sc.close();
    }
}
