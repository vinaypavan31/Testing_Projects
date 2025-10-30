package problems;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		System.out.println("Enter a number : ");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rev=0,r,a;
		while(num>0) {
			r=num%10;
			rev=r+rev*10;
			num=num/10;
			
			
		}
		System.out.println(rev);
		
		
	}

}
