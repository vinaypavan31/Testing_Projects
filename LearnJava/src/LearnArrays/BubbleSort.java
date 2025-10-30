package LearnArrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BubbleSort {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// Accepts the input from the keyboard.
		   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// Create an int type array. 
		   System.out.println("How many numbers do you want to enter");
		   int n = Integer.parseInt(br.readLine());
		   int[ ] num = new int[n];
		 
		// Store the integer numbers into the array.
		   System.out.println("Enter your numbers:");
		   for(int i = 0; i < n; i++){
		      num[i] = Integer.parseInt(br.readLine());
		   }
		// Here, we will use bubble sort technique to sort integer numbers.
		   int limit = n - 1; // elements from 0 to n - 1.
		   boolean flag = false; //  If it is true, swapping done.
		   int temp; // temporary variable.
		   
		   for(int i = 0; i < limit; i++)
		   {
		     for(int j = 0; j < limit - 1; j++) 
		     { 
		   // If first number is bigger than second one, swap. 
		       if(num[j] > num[j+1])
		       {   
		         temp = num[j];
		         num[j] = num[j+1];
		         num[j+1] = temp;
		         flag = true; // true, swapping done.
		       }
		     }
		    if(flag == false) break; // no swapping, so come out.
		      else flag = false; // assign initial value.
		   }
		 // Display the sorted array in ascending order.
		    System.out.println("Sorted array in ascending order: ");
		    for(int i = 0; i < n; i++)
		    	System.out.println(num[i]);

	}

}
