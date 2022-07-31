package WhileLoop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        while (name.isBlank()) {
            System.out.println("Enter you name: ");
            name = scanner.nextLine();
        }
        System.out.println("Hello "+ name);

        int age;
        do {
            System.out.println("Enter you age: ");
            age = scanner.nextInt();
        } while (age == 0);
        System.out.println("Your age is: " + age);
    }
}
