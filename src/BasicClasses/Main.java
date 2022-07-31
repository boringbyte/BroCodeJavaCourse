package BasicClasses;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        Car friendCar = new Car();
        System.out.println(myCar.model);
        System.out.println(myCar.make);
        myCar.drive();
        myCar.brake();

        System.out.println(friendCar.make);
        System.out.println(friendCar.model);
    }
}
