//Write a program that takes two numbers and an operator (+, -, *, /) from the user. 
//Perform the corresponding arithmetic operation and display the result of all the arithmetic operations. 
//Handle exceptions for invalid operators and division by zero.
package collection;
import java.util.Scanner; // Import the Scanner class to take user input
public class ArithmeticCalculator { // Define a public class named ArithmeticCalculator
    public static void main(String[] args) { // Define the main method that runs the program
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read user input

        System.out.print("Enter the first number: "); // Prompt the user to enter the first number
        double num1 = scanner.nextDouble(); // Read the first number as a double and store it in num1

        System.out.print("Enter the second number: "); // Prompt the user to enter the second number
        double num2 = scanner.nextDouble(); // Read the second number as a double and store it in num2

        System.out.print("Enter the operator (+, -, *, /): "); // Prompt the user to enter the operator
        char operator = scanner.next().charAt(0); // Read the first character of the user input and store it in operator

        double result = 0; // Declare and initialize a variable named result to store the result of the operation

        switch (operator) { // Use a switch statement to handle different operators
            case '+': // If the operator is +
                result = num1 + num2; // Add num1 and num2 and store it in result
                break; // Break out of the switch statement
            case '-': // If the operator is -
                result = num1 - num2; // Subtract num2 from num1 and store it in result
                break; // Break out of the switch statement
            case '*': // If the operator is *
                result = num1 * num2; // Multiply num1 and num2 and store it in result
                break; // Break out of the switch statement
            case '/': // If the operator is /
                if (num2 != 0) { // If num2 is not zero
                    result = num1 / num2; // Divide num1 by num2 and store it in result
                } else { // If n
                    System.out.println("Error: Division by zero is not allowed."); // Print an error message
                } // Close the else block
                break; // Break out of the switch statement
            default: // If none of the above cases match
                System.out.println("Error: Invalid operator."); // Print an error message
                return; // Terminate the program
        } // Close the switch statement

        System.out.println("Result of addition: " + (num1 + num2)); // Print the result of addition using + operator
        System.out.println("Result of subtraction: " + (num1 - num2)); // Print the result of subtraction using - operator
        System.out.println("Result of multiplication: " + (num1 * num2)); // Print the result of multiplication using * operator
        System.out.println("Result of division: " + (num1 / num2)); // Print the result of division using / operator
        System.out.println("Result of " + operator + " operation: " + result); // Print the result of the operation using user input operator

        scanner.close(); // Close the scanner object to avoid memory leaks
    } // Close the main method
} // Close the class definition
