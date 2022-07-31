package Encapsulation;

public class Main {
    public static void main(String[] args) {
        // Encapsulation --> Attributes of a class will be hidden or private, Can be accessed only through getter and setters
        // You should make attributes private if you don't have a reason to make them public

        Car car = new Car("Chevrolet", "Camaro", 2022);
        System.out.println(car.getModel());
        System.out.println(car.getMake());
        System.out.println(car.getYear());
    }
}
