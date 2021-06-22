package aplication;

import java.util.Scanner;

public class aula64IntroPOO {
    public static void main(String[] args) {

        double xA, xB, xC, yA, yB, yC;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Measures o the Triangle X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Enter The measures of the Triangle Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC) / 2;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

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
