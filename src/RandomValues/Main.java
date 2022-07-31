package RandomValues;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int x = random.nextInt();
        System.out.println("Random integer is: " + x);
        int diceValue = random.nextInt(6) + 1; // starts from 0
        System.out.println("Dice value is: " + diceValue);
        double z = random.nextDouble(); // gives between 0 and 1;
        System.out.println("Random double values is: " + z);
    }
}
