package problems;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String to check whether it is apalindrome or not : ");
		String s1=sc.nextLine();
		String reverse="";
		for(int i =s1.length()-1;i>=0;i--) {
			reverse=reverse+s1.charAt(i);
		}
		
		if(s1.equalsIgnoreCase(reverse)) {
			System.out.println("yes it is a palindrome.");
		}
		else
			System.out.println("it is not a palindrome");
	}

}
