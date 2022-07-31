package ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // A resizable array. <> should contain wrapper classes
        ArrayList<String> food = new ArrayList<String>();
        food.add("Pizza");
        food.add("Hamburger");
        food.add("Hotdog");

        for(int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
        System.out.println();

        food.set(0, "Sushi");
        for(int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
        System.out.println();

        food.remove(2);
        for(int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }
        food.clear();
    }
}
