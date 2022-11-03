package org.example;

public class concatArrayNames {
    public static void main(String[] args) {
        String[] names = {"andres", "berto", "carlos", "dani", "eduardo"};
        concatWords(names);
    }

    private static void concatWords(String[] names) {
        for (int i=0 ; i<names.length ; i++) {
            System.out.println("la persona con el numero "+(i+1) + " se llama : " + names[i]);

        }
    }
}
