package collection;

public class NullPointerExc {
    public static void main(String[] args) {
        String a = "Hello, World!"; // Initializing a reference variable with a non-null value

        try {
            int length = a.length(); // This line will not throw a NullPointerException
            System.out.println("Length of the text: " + length);
        } catch (NullPointerException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
