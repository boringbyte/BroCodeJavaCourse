package StringMethods;

public class Main {
    public static void main(String[] args) {
        String name = "boringbyte";
//        boolean result = name.equals("boringbyte");
//        boolean result = name.equalsIgnoreCase("boringByte");
//        int length = name.length();
//        char result = name.charAt(4);
//        boolean result = name.isEmpty();
        String upName = name.toUpperCase();
        String lowName = name.toLowerCase();
        String trimmedName = name.trim();
        String result = name.replace('b', 'a');
        System.out.println(result);
    }
}
