package LearnArrays;

import java.util.Arrays;

public class FillSortArrays {
	public static void main(String[] args) {
		int[] arr= {2,3,4,5,6,7,8};
		
		Arrays.fill(arr, 10);
		
		System.out.println("values of arr : "+Arrays.toString(arr));
		
		int[] array = {9,8,7,6,9,5,43,2};
		Arrays.fill(array, 6,7,88);
		System.out.println("values of arr : "+Arrays.toString(array));
		
		int[] arr3= {4,2,6,7,534,3,65,4,7,6,4,44,3,55,5,66,6,7,7777,8,889};
		Arrays.sort(arr3);
		
		System.out.println(Arrays.toString(arr3));
		
		int[] arr4= {43,42,56,7,89,56,78,4,5,6,7};
		Arrays.sort(arr4,2,arr4.length-1);
		System.out.println(Arrays.toString(arr4));
		
		int[] arr5= {4,5,6,7,3,2,8,9,7};
		Arrays.stream(arr5);
		System.out.println(Arrays.toString(arr5));
		
		String[ ] cities = {"Dhanbad", "Ranchi", "New York", "Delhi", "Bhopal"};
		  Arrays.parallelSort(cities); // Sorting whole array.
		  String nameOfCities = Arrays.toString(cities);
		  System.out.println("Using parallelSort(): " +nameOfCities);
		 
		  char[ ] chars = new char[ ]{'d','h','a', 'n','b','a','d'};
		  Arrays.parallelSort(chars, 0, 7); // Sorting the part of an array.
		  System.out.println("Using parallelSort(): " +Arrays.toString(chars));
		  
		  int[ ] num1 = {1, 2, 3, 4, 5};
		   int[ ] num2 = {1, 2, 7, 4, 5};
		   int[ ] num3 = {1, 2, 3, 4, 5};
		 
		// Finding mismatched index in arrays.
		   System.out.println("Arrays.mismatch(num1, num2): " +Arrays.mismatch(num1, num2));
		   System.out.println("Arrays.mismatch(num1, num3): " +Arrays.mismatch(num1, num3));
		   System.out.println("Arrays.mismatch(num1, 0, 5, num2, 0, 1): " +Arrays.mismatch(num1, 0, 5, num2, 0, 1));
		   
		   int[ ] nums = {1, 2, 3, 4, 5};
		    String[ ] names  = {"Deepak", "John", "Herry", "Johnson"};
		    char[ ] charss = {'a', 'b', 'c', 'd', 'e'};
		 
		 // Finding hashcode of arrays.
		    System.out.println("Arrays.hashCode(num1): " +Arrays.hashCode(nums));
		    System.out.println("Arrays.hashCode(names): " +Arrays.hashCode(names));
		    System.out.println("Arrays.hashCode(chars): " +Arrays.hashCode(charss));
	}
}
