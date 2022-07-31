package SwitchVariables;

public class Main {
    public static void main(String[] args) {
        String x = "Water";
        String y = "Kool-Aid";

        System.out.println("x: " + x);
        System.out.println("y: " + y);

        String temp;
        temp = x;
        x = y;
        y = temp;

        System.out.println("x: " + x);
        System.out.println("y: " + y);

    }
}
