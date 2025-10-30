package problems;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		System.out.println("Enter a number : ");

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int sum=0;
		int original=num;
		while(num>0) {
			int rem=num%10;
			num=num/10;
			sum=sum+rem;
			
		}
		
		System.out.println("Sum of digits of "+original+" is "+sum);

	}

}
