package entities;

public class aula79Products {

    private String name;
    private double price;
    private int quantity;

    // Construtor

    public aula79Products(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    } // Quantity so tera get devido proteção do valor do produto de alteração de
      // forma indevida.

    public int getQuantity() {
        return quantity;
    }

    public double totalValueInStock() {

        return price * quantity;

    }

    public void addProducts(int quantity) {

        this.quantity += quantity;

    }

    public void removeProducts(int quantity) {

        this.quantity -= quantity;

    }

    public String toString() {
        return name + ", R$ " + String.format("%.2f", price) + ", " + quantity + " unidades, " + " Total: R$ "
                + String.format("%.2f", totalValueInStock());
    }

}
