package problems;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter a number : ");
		
		Scanner sc= new Scanner(System.in);
		
		int num =sc.nextInt();
		
		if(isPrime(num)) {
			System.out.println(num+" is a prime number.");
		}
		else {
			System.out.println(num+" is not a prime number");
		}
		
		

	}
	public static boolean isPrime(int num) {
		//in condition we can use i<n/2 or i< Math.sqrt(n)
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return false;
			}
			
		}
		return true;
	}

}
