package WrapperClasses;

public class Main {
    /*
     * Provides a way to use primitive data types as reference data types. Reference data types contain useful methods
     * Can be used with collections (ex. ArrayList)
     * boolean --> Boolean
     * char    --> Character
     * int     --> Integer
     * double  --> Double
     */
    public static void main(String[] args) {
        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Bro";

        if (a == true) {
            System.out.println("This is true");
        }
    }
}
