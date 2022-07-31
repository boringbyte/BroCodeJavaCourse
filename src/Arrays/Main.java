package Arrays;

public class Main {
    public static void main(String[] args) {
        String[] cars = {"Camaro", "Corvette", "Tesla", "BMW"};
        cars[0] = "Mustang";
        System.out.println(cars[0]);

        String[] newCars = new String[3];
        newCars[0] = "Toyota";
        newCars[1] = "Honda";
        newCars[2] = "Nissan";
        System.out.println("Japanese cars company: " + newCars[1]);

        String[][] twoDCars = new String[3][3];
        twoDCars[0][0] = "Camaro";
        twoDCars[0][1] = "Corvette";
        twoDCars[0][2] = "Silverado";
        twoDCars[1][0] = "Mustang";
        twoDCars[1][1] = "Bronco";
        twoDCars[1][2] = "F-150";
        twoDCars[2][0] = "Highlander";
        twoDCars[2][1] = "Camry";
        twoDCars[2][2] = "Corolla";

        for (int i = 0; i < twoDCars.length; i++) {
            System.out.println();
            for (int j = 0; j < twoDCars[i].length; j++) {
                System.out.println("Car is: " + twoDCars[i][j]);
            };
        }
    }
}
