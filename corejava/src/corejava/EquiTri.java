package corejava;

import java.util.Scanner;

public class EquiTri {
	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Ask user for the number of rows (height of the triangle)
	        System.out.print("Enter the number of rows for the triangle: ");
	        int rows = scanner.nextInt();

	        for (int i = 1; i <= rows; i++) {
	            // Print leading spaces
	            for (int j = 1; j <= rows - i; j++) {
	                System.out.print(" ");
	            }

	            // Print stars with a space between them
	            for (int k = 1; k <= (2 * i - 1); k++) {
	                System.out.print("*");
	            }

	            // Move to the next line
	            System.out.println();
	        }

	        scanner.close();
	    
	}

}
