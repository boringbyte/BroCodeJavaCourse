package PassObjectsAsArguments;

public class Garage {
    Car car;
    void park(Car car) {
        this.car = car;
        System.out.println("The " + car.name + " is parked in the garage.");
    }
}
