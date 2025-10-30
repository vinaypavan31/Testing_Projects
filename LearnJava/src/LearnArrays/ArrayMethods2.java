package LearnArrays;

import java.util.Arrays;

public class ArrayMethods2 {

	public static void main(String[] args) {
		int[] org= {20,38,47,89,90,47};
		int[] dup=Arrays.copyOf(org, 6);
		System.out.println(Arrays.toString(dup));
		
		int[] dup1=Arrays.copyOf(org, 3);
		System.out.println(Arrays.toString(dup1));
		
		int[] dup2=Arrays.copyOf(org, 9);
		System.out.println(Arrays.toString(dup2));
		
		int[] org2= {4,57,85,948,384,73,85,67};
		
		int[] dup3=Arrays.copyOfRange(org2,1,4);
		System.out.println(Arrays.toString(dup3));
		
		int[ ][ ] array1 = {{20, 30, 40, 50}, {5, 10, 15}};
		   int[ ][ ] array2 = {{20, 30, 40, 50}, {5, 10, 15}};
		 
		   System.out.println("Integer arrays on comparision: " +Arrays.deepEquals(array1, array2));
		 
		   int[ ][ ] array3 = {{2, 3, 4, 5}, {5, 6}};
		   int[ ][ ] array4 = {{2, 3, 4, 6}, {5, 6}};
		   System.out.println("Integer arrays on comparision: " +Arrays.deepEquals(array3, array4));
		
		   int[ ] array11 = {20, 30, 40, 50};
		   int[ ] array21 = {20, 30, 40, 50};
		  
		   System.out.println("Integer arrays on comparision: " +Arrays.equals(array11, array21));
		  
		   int[ ] array31 = {2, 3, 4, 5};
		   int[ ] array41 = {2, 3, 4, 6};
		   System.out.println("Integer arrays on comparision: " +Arrays.equals(array31, array41));
	}

}
