package problems;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		
		   Scanner sc = new Scanner(System.in);
		   int x, y;
		   System.out.println("Enter your first number: ");
		   x = sc.nextInt();
		   System.out.println("Enter your second number: ");
		   y = sc.nextInt();
		   System.out.println("Before swapping, x = " +x+ ", y = " +y);
		   x = x + y;
		   y = x - y;
		   x = x - y;
		   System.out.println("After swapping, x = " +x+ ", y = " +y);

	}

}
