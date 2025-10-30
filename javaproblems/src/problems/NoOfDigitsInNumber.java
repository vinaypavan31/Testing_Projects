package problems;

import java.util.Scanner;

public class NoOfDigitsInNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number : ");

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int count=0;
		if(num<0) {
			num=num*-1;
		}
		else if(num==0) {
			num=1;
		}
		while(num>0) {
			
			num=num/10;
			count++;
		}
		System.out.println(count);
		
	}

}
