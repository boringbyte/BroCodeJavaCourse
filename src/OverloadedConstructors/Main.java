package OverloadedConstructors;

public class Main {
    public static void main(String[] args) {
        // overloaded constructors = multiple constructors within a class with the same name, but have different
        // parameters. name + parameters = signature

        Pizza pizza = new Pizza("Thicc crust", "tomato", "mozzarella", "pepperoni");
        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);

        Pizza cheesePizza = new Pizza("Thicc crust", "tomato", "mozzarella");
        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(cheesePizza.bread);
        System.out.println(cheesePizza.sauce);
        System.out.println(cheesePizza.cheese);
        System.out.println(cheesePizza.topping); // returns null
    }
}
