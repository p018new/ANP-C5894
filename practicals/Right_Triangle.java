package loops; 

import java.util.Scanner;

public class Right_Triangle 
{
    public static void main(String[] args) 
    {
        Scanner p =new Scanner(System.in);

        System.out.print("Enter the number of rows for the triangle: ");
        int rows = p.nextInt();

        for (int i = 1; i <= rows; i++) 
        {
            for (int j = 1; j <= i; j++) 
            {
                System.out.print("*");
            }
            
            System.out.println();
        }
        
        p.close();                     
}
}