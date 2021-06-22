package entities;

public class aula64Triangle {

    public double a;
    public double b;
    public double c;

    public double area() {
        double p = (a + b + c) / 2.0;

        // double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        // return result;
        // ou
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

}
