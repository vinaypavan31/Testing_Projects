package problems;

import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args) {
		int num, newNum, reverse = 0, remainder; // variables declared.
		 // Create an object of Scanner class to take the input from the user.
		    Scanner sc = new Scanner(System.in);

		 // Prompt the user to enter a number.   
		    System.out.println("Enter any number: ");
		 // This statement will read the next integer value from the input source and store it into a variable named num.
		    num = sc.nextInt();
		    newNum = num; // Assigning the original integer number to another one. 

		 // Reverse the integer number stored in a variable newNum.   
		    while(num > 0)
		    {
			remainder = num % 10; // getting remainder.
			reverse = (reverse * 10) + remainder;
			num = num / 10;
		    }
		    if(reverse == newNum)
			System.out.println("Number is Palindrome");
		    else
			System.out.println("Number is not Palindrome");

	}

}
