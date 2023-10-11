package collection;
import java.util.*;
public class HashExample 
	//HashSet example
{
	public static void main(String[] args)
		{
		Set<String> s=new HashSet<String>();	
		s.add("A");
		s.add("B");
		s.add("C");
		s.add("D");
		//printing the elements
		System.out.println("Elements are:" +s);
		
		String c="D";
		
		//check whether the string is available or not
		System.out.println("elements contains:"+c+" " +s.contains(c));
		}
		

	}

