//Write a program that takes an integer input from the user and throws this custom exception if the input is negative. 
//Catch the exception and display an error message accordingly.
package collection; 
import java.util.Scanner; // import the Scanner class to get user input
class CustomExceptionExample {

    // define a custom exception class that extends Exception
    static class NegativeInputException extends Exception { // make it static
        // constructor that takes a message as an argument
        public NegativeInputException(String message) {
            // call the super class constructor with the message
            super(message);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create a scanner object to read user input

        System.out.print("Enter an integer: ");
        int input = scanner.nextInt(); // read an integer from the user

        try {
            if (input < 0) { // check if the input is negative
                // throw a custom exception with a message
                throw new NegativeInputException("Input cannot be negative!");
            }
            System.out.println("You entered: " + input); // display the input
        } catch (NegativeInputException exception) { // catch the custom exception
            System.out.println("An exception occurred: " + exception.getMessage()); // display the error message
        } finally {
            scanner.close(); // close the scanner in a finally block to avoid resource leak
        }
    }
}
