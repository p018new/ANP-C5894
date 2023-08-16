package Interface;
import java.util.ArrayList;
import java.util.List;
public class ListExample 
{
		public static void main(String[] args)
		{
			// Create list of integers
			List<Integer> num = new ArrayList<>();
			
			// Add elements in list
			num.add(12);
			num.add(20);
			num.add(10);
			num.add(11);
			
			 // Access elements in the list
	        System.out.println("List: " + num);
	        
	        // Update elements in the list
	        num.set(1, 25);
	        System.out.println("Updated List: " + num);
	        
	        // Remove elements from the list
	        num.remove(3); // Removes the element at index 3
	        System.out.println("List after removing element at index 3: " + num);

		}

	}
