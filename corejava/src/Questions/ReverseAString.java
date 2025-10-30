package Questions;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		System.out.println("Enter a string to get it reversed : ");
		Scanner sc =new Scanner(System.in);
		String text=sc.next();
		String newText="";
//		char[] arr=text.toCharArray();
//		for(int i =arr.length-1;i>=0;i--) {
//			newText=newText+arr[i];
//		}
		
		for(int i=text.length()-1;i>=0;i--) {
			newText=newText+text.charAt(i);
		}
		System.out.println(newText);
		
		

	}

}
