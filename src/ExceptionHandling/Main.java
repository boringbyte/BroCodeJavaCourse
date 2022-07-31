package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter a whole number to divide");
            int x = scanner.nextInt();

            System.out.println("Enter a whole number to divided by: ");
            int y = scanner.nextInt();

            int z = x / y;

            System.out.println("result: " + z);
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by 0!");
        } catch (InputMismatchException e) {
            System.out.println("Please enter a number!!");
        } catch (Exception e) {
            System.out.println("Just enters integer numbers only!");
        } finally {
            scanner.close();
            System.out.println("This will always print");
        }
    }
}
