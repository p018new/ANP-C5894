package collection;
import java.util.HashSet;
public class HashSetExample 
{
	public static void main(String[] args) {
			//Creating a HashSet of Integer type
			HashSet<Integer> set = new HashSet<Integer>();
			
			//Adding elements to the set
			set.add(10);
			set.add(20);
			set.add(30);
			set.add(40);
			
			//Printing the elements of the set
			System.out.println("The set contains: " + set);
			
			//Checking whether a specific element exists in the set
			boolean contains = set.contains(20);
			
			if (contains) {
				System.out.println("The set contains 20");
			} else {
				System.out.println("The set does not contain 20");
			}
			
			//Removing an element from the set
			set.remove(40);
			
			//Printing the elements of the set after removal
			System.out.println("The set contains after removal: " + set);
			
		}
	}

