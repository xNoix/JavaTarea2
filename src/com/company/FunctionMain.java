package com.company;

public class FunctionMain {

    private static double Iva(int n) {
        double iva = (n / 100) * 19;
        double result = n + iva;

        return result;
    }

    public static void main(String[] args) {
        double total;

        total = Iva(100);

        System.out.println(total);
    }
}
