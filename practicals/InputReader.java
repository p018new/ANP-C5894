//Write a Java program that reads an integer from the user using the Scanner class. 
//Handle the InputMismatchException that can occur if the user enters a non-integer value. 
//Display an appropriate error message.
package collection;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputReader 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        try {
            // Prompt the user to enter an integer
            System.out.print("Enter an integer: ");

            // Read the integer from the user input
            number = scanner.nextInt();

            // Print the integer entered by the user
            System.out.println("You entered: " + number);
        } catch (InputMismatchException e) {
            // Print an error message if the user enters invalid input
            System.out.println("Error: Invalid input. Please enter an integer.");
        }
    }
}
