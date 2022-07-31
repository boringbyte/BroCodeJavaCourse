package ToStringMethod;

public class Car {
    String make = "Ford";
    String model = "Mustang";
    int year = 2022;
    String color = "Red";

    @Override
    public String toString() {
        return "Car is " + make + " " + model + " " + year + " " + color;
    }
}
