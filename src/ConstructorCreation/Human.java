package ConstructorCreation;

public class Human {
    // constructor is a special method that is called when an object is instantiated

    String name;
    int age;
    double weight;
    Human(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void drink() {
        System.out.println(this.name + " is eating");
    }

    void eat() {
        System.out.println(this.name + " is drinking *burp*");
    }
}
