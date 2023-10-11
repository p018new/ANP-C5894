//DivideByZeroException example
package collection; // use a different name for the package

import java.util.Scanner;

public class DivideByZero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // use a meaningful name

        System.out.print("Enter the numerator: ");
        int numerator = scanner.nextInt();

        System.out.print("Enter the denominator: ");
        int denominator = scanner.nextInt();

        try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException exception) { // use a meaningful name
            System.out.println("An exception occurred: " + exception.getMessage());
        } finally {
            scanner.close(); // close the scanner in a finally block
        }
    }
}
