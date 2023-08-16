package array;

public class ArrayDoubles 
{
 public static void main(String[] args) {
	        // Declare and initialize an array of doubles
	        double[] arr = {1.2, 3.4, 5.6, 7.8, 9.0};

	        // Declare and initialize a variable to store the sum of the array elements
	        double sum = 0;

	        // Loop through the array and add each element to the sum
	        for (int i = 0; i < arr.length; i++) {
	            sum += arr[i];
	        }

	        // Declare and calculate the average by dividing the sum by the array length
	        double average = sum / arr.length;

	        // Display the average
	        System.out.println("The average of the array is " + average);
	    }
	}


