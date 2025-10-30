package strings;

import java.util.Scanner;

public class ReverseEachWordOfString {

	public static void main(String[] args) {
		System.out.println("Enter a string : ");
		Scanner sc = new Scanner(System.in);
		
		String text=sc.nextLine();
		System.out.println(text);
		String reverse="";
		String[] textArr=text.split(" ");
		for(String x:textArr) {
			for(int i=x.length()-1;i>=0;i--) {
				 reverse=reverse+x.charAt(i);
				 
			}
			reverse=reverse+" ";
			
		}
		System.out.println(reverse);

	}

}
