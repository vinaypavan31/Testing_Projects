package problems;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter a number : ");
		
		Scanner sc = new Scanner(System.in);
		
		int num=sc.nextInt();
		int arm=0,rem;
		int d=num;
		while(num>0) {
			rem=num%10;
			num=num/10;

			arm=arm+rem*rem*rem;
					}
		if(d==arm) {
			System.out.println(d+" is a Armstrong number");
		}
		else {
			System.out.println(d+" is not a Armstrong number");
		}
		
	}

}
