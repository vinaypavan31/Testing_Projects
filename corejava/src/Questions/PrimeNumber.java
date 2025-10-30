package Questions;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter a number to check wheather it is a prime or not");
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		
		
		if(isPrime(number)) {
			System.out.println("it is a prime");
		}
		else {
			System.out.println("not a prime");
		}

	}
	public static boolean isPrime(int num) {
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				return false;
			}
			
		}
		return true;
	}
	

}
