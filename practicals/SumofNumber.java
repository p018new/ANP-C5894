package loops;
import java.util.Scanner;
//Write a Java program that prompts the user to enter a number and then prints the multiplication table of that number using a for loop. The table should display multiplication from 1 to 10.
public class SumofNumber 
{
    public static void main(String[] args) {
    	//Scanner class to take input from the user 
        Scanner input = new Scanner(System.in);
        //initialize the value
        int number;
        int sum = 0;
        
        do 
        {
        	//declaring the input statement
            System.out.print("Enter a number (0 to stop): ");
            number = input.nextInt();
            sum += number; // add the number to the sum
        } 
        while (number != 0); // keep asking for numbers until the user enters 0
        System.out.println("The sum is " + sum);//print the final statement
        input.close();
    }
}


