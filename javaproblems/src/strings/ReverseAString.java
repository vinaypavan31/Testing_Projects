package strings;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		System.out.println("Enter a string : ");
		Scanner sc = new Scanner(System.in);
		
		String text=sc.nextLine();
		String reverse="";
		for(int i=text.length()-1;i>=0;i--) {
			reverse=reverse+text.charAt(i);
		}
		System.out.println("reverse String is : "+reverse);
	}

}
