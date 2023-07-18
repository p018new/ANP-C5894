package loops;

public class EvenNumbers 
{
    public static void main(String[] args)
    {
        //num initialized to 1
        int num = 1;
        
        //sum intialized to 0
        int sum = 0;
        
        //condition to check num is less than equal to 100
        while (num <= 100)
        {
            //if condition to check even number
            if (num % 2 == 0)
            {
                sum += num;
            }
            
            num++;//num is incremented by 1
        }
        
        //print sum of even numbers from 1 to 100
        System.out.println("Sum of Even Numbers: " + sum);
    }
}
