package aplication;

import java.util.Scanner;

import entities.aula79Products;

public class aula79Encapsulamento {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // aula67Product product = new aula67Product();

        // System.out.println(product.name);
        // System.out.println(product.price);
        // System.out.println(product.quantity);

        System.out.println("Enter product Data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.println("");
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in Stock: ");
        int quantity = sc.nextInt();

        aula79Products product = new aula79Products(name, price, quantity);

        product.setName("Computer");
        System.out.println("Updated Data: " + product.getName());
        product.setPrice(1200);
        System.out.println("Updated Price: " + product.getPrice());
        System.out.println("Quantity: " + product.getQuantity());
        System.out.println("");
        System.out.println("Product Data: " + product);

        System.out.print("Enter the number of produtos to be added in stock: ");
        quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println("");
        System.out.println("Updated Data: " + product);

        System.out.print("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);
        System.out.println("");
        System.out.println("Updated Data: " + product);

        sc.close();

    }
}
