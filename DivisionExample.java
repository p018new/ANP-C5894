//Write a program that attempts to divide two numbers. 
//Whether the division is successful or not, make sure to display a "Division completed" message. 
//Ensure that the division operation is performed in a try block and the "Division completed" message is displayed in a finally block.
package collection;
import java.util.Scanner;
public class DivisionExample 
{
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in); // create a scanner object to read user input
	        System.out.print("Enter two numbers to divide: ");
	        int numerator = scanner.nextInt(); // read the first number
	        int denominator = scanner.nextInt(); // read the second number

	        try {
	            int result = numerator / denominator; // perform the division in a try block
	            System.out.println("The result is: " + result); // display the result
	        } catch (ArithmeticException e) { // catch the exception if the denominator is zero
	            System.out.println("Error: " + e.getMessage()); // display the error message
	        } finally {
	            System.out.println("Division completed"); // display the completion message in a finally block
	            scanner.close(); // close the scanner
	        }
	    }
	}

