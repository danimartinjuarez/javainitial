package org.example;

public class ivaFunction {
    public static void main(String[] args) {
        double price= 16.00;
        double totalPrice=ivaPrice(price);
        System.out.println("El precio total es: " + totalPrice);


    }

    private static double ivaPrice(double price) {
        return price*1.21;
    }
}
