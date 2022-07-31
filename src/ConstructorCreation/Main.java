package ConstructorCreation;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Rick", 65, 70);
        System.out.println("Name of the first human is: " + human1.name);
        Human human2 = new Human("Morty", 17, 50);
        System.out.println("Name of the second human is: " + human2.name);
        human1.drink();
        human2.eat();
    }
}
