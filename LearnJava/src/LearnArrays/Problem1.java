package LearnArrays;

public class Problem1 {

	public static void main(String[] args) {
		
		// Create a 2D array of int type.
	     int[ ][ ] x = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	  
	  // Read and display array elements in a matrix form.
	     System.out.println("Displaying elements of 2D array in a matrix form:");
	  
	  // Applying nested for loop.
	     for(int i = 0; i < 3; i++) // Outer for loop for Rows
	     {
		 for(int j = 0; j < 3; j++) // Columns in each row.
		 {
		     System.out.print(x[i][j]+ "\t"); 
		 }
	        System.out.println(); // next line.	 
	     }
	}

}
