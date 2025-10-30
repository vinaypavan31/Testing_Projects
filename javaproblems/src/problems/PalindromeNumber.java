package problems;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number : ");

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int original=num;
		
		int reversed=0;
		
		while(num!=0) {
			int digit=num%10;
			reversed=reversed*10+digit;
			
			
			num=num/10;
		}
		
		if(original==reversed) {
			System.out.println(original+" is a palindrome number");
		}
		else {
			System.out.println(reversed+" is not a palindrome number");
		}

	}

}
