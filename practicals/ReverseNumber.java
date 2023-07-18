package loops;

public class ReverseNumber {
    public static void main(String[] args) 
    {
        //initializing number
        int number = 198756;
        
        //reversed number initialized to 0
        int reversedNumber = 0;
        
        //condition to check number is not equal to 0
        while (number != 0) 
        {
            int remainder = number % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            number /= 10;
        }
        
        //print reverse number
        System.out.println("Reversed number: " + reversedNumber);
    }
}
