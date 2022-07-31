package OverloadedMethods;

public class Main {
    public static void main(String[] args) {
        System.out.println(add(10, 2));
        System.out.println(add(1, 2, 3));
        System.out.println(add(10, 2.0));
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static double add(double a, double b) {
        return a + b;
    }
}
