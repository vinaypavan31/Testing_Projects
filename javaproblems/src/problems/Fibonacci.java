package problems;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		//1 1 2 3 5 8 13 .....
		
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		int first=0;
		int second=1;
		int next;
		
		for(int i=0;i<=num;i++) {
			//8=5+3
			System.out.println(first+" ");
			next=second+first;
			first=second;
			second=next;
			
			
			
			
		}

	}

}
