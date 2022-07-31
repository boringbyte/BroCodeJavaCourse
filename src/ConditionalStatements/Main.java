package ConditionalStatements;

public class Main {
    public static void main(String[] args) {
        int value = 70;
        int age = value + 6;
        if (age >= 18 && age < 75) {
            System.out.println("You are an adult!");
        } else if (age >= 75){
            System.out.println("Ok Boomer!");
        } else if (age >= 13 && age < 18) {
            System.out.println("You are a teenager!");
        } else {
            System.out.println("You are not an adult!");
        }
    }
}
