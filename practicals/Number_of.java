package loops;

import java.util.Scanner;

public class Number_of
{
    public static void main(String[] args)
    {
        //Scanner class object
        Scanner s = new Scanner(System.in);
        
        //input from user
        System.out.print("Enter the number of values to sum: ");
        
        //integer input
        int count = s.nextInt();
        int sum = 0;
        for (int i = 1; i <= count; i++) 
        {
            System.out.print("Enter value #" + i + ": ");
            int value = s.nextInt();
            sum += value;
        }
        
        System.out.println("The sum of all " + count + " numbers is: " + sum);
        
        s.close();
    }
}
