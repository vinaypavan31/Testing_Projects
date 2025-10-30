package LearnArrays;

import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {
		
		String[] str= {"delhi","tokyo","chennai","mumbai","hyderabad"};
		System.out.println(Arrays.asList(str));
		
		// Creating a sorted array of int and char types.	
	    int[ ] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
	    System.out.println("1. Index of element 11 is " + Arrays.binarySearch(list, 11));
	    System.out.println("2. Index of element 12 is " + Arrays.binarySearch(list, 12));
		
	    char[ ] chars = {'a', 'c', 'g', 'x', 'y', 'z'};
	    System.out.println("3. Index of element 'a' is " + Arrays.binarySearch(chars, 'a'));
	    System.out.println("4. Index of element 't' is " + Arrays.binarySearch(chars, 't'));
	  
	 // Creating unsorted array.
	    int[ ] num = {25, 35, 10, 45, 20, 30};
	    Arrays.sort(num); // Sorting array. 
	    System.out.println("5. Index of element 45 is " +Arrays.binarySearch(num, 45));
		
	 // Creating arrays of int type.	
	     int[ ] num1 = {1, 2, 3, 4, 5};
	     int[ ] num2 = {1, 2, 7, 4, 5};
	     int[ ] num3 = {1, 2, 3, 4, 5};

	  // Comparing both arrays lexicographically. 
	     System.out.println("\nComparing arrays using compare method:");  
	     System.out.println("Arrays.compare(num1, num2): " +Arrays.compare(num1, num2));
	     System.out.println("Arrays.compare(num2, num1): " +Arrays.compare(num2, num1));
	     System.out.println("Arrays.compare(num1, num3): " +Arrays.compare(num1, num3));
	     
	  // Creating arrays of int data type.	
	     int[ ] num4 = {1, 2, 3, 4, 5};
	     int[ ] num5 = {1, 2, 3};
	  // Comparing both arrays.
	     System.out.println("\nComparing arrays using compareUnsigned method:");
	     System.out.println("Arrays.compareUnsigned(num4, num5): " +Arrays.compareUnsigned(num4, num5));
	}

}
