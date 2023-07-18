package loops;
import java.util.Scanner;
// Generating table of the given number
public class MultiplicationTable 
{
	public static void main(String[] args)
	{
		//Scanner class to take input from the user
	        Scanner scanner = new Scanner(System.in);
     //Generating a value
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
        //Giving a Multiplication table 
	        System.out.println("Multiplication Table for " + number + ":");
             //IF condition to multiply the given number
	        for (int i = 1; i <= 10; i++) {// initializing a value
	            int result = number * i;//chechking if it meets the condition
	            // printing the entire table 
	            System.out.println(number + " x " + i + " = " + result);
	        }

	              scanner.close();
	    }
	}


