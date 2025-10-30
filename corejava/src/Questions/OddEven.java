package Questions;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		System.out.println("Enter a number to check it is odd or even");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num<=0) {
			System.out.println("please enter natural numbers");
		}
		else if (num%2==0) {
			System.out.println("it is an even number");
		}
		else {
			System.out.println("it is an odd number");
		}

	}

}
