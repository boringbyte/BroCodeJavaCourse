package Methods;

public class Main {
    public static void main(String[] args) {
        hello("boringbyte", 19);
        System.out.println("Sum of two number is: " + sum(10, 12));
    }

    static void hello(String name, int age) {
        System.out.println("Hello " + name);
        System.out.println("You are " + age);
    }

    static int sum(int x, int y) {
        return x + y;
    }
}
