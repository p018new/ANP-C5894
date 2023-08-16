package Interface;
import java.util.ArrayList;
public class ListSum 
{
	public static void main(String[] args) {
	        // Create a sample ArrayList
	        ArrayList<Integer> numbers = new ArrayList<>();
	        numbers.add(5);
	        numbers.add(10);
	        numbers.add(15);
	        numbers.add(20);

	        // Call the method to find the sum of elements
	        int sum = findSum(numbers);

	        // Print the sum
	        System.out.println("Sum of elements: " + sum);
	    }

	    public static int findSum(ArrayList<Integer> list) {
	        int sum = 0;

	        // Iterate through the ArrayList and add each element to the sum
	        for (int num : list) {
	            sum += num;
	        }

	        return sum;
	    }
	}


