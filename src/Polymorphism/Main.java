package Polymorphism;

public class Main {
    public static void main(String[] args) {
        // Polymorphism --> Ability tof an object to identify as more than one type.

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] racers = {car, bicycle, boat};

        for (Vehicle vehicle :racers) {
            vehicle.go();
        }
    }
}
