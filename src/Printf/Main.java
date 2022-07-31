package Printf;

public class Main {
    public static void main(String[] args) {
        // two arguments = format string + (object/variable/value)
        // % [flag] [precision] [width] [conversion- character]
        System.out.printf("%d This is a format string\n", 123);
        boolean myBoolean = true;
        char myChar = '@';
        String myString = "BoringByte";
        int myInt = 50;
        double myDouble = 1000;

        System.out.printf("%b\n", myBoolean);
        System.out.printf("%c\n", myChar);
        System.out.printf("%s\n", myString);
        System.out.printf("%f\n", myDouble);

        System.out.printf("Hello %20s\n", myString);
        System.out.printf("Hello %-20s .\n", myString);

        System.out.printf("You have this much money %f\n", myDouble);
        /*
         * [flags]
         * - : left-justify
         * + : output a plus (+) or minus (-) sign for a numeric value
         * 0 : numeric values are zero padded
         * , : comma grouping separator if numbers > 1000
         */
        System.out.printf("You have this much money %.2f\n", myDouble);
    }
}
