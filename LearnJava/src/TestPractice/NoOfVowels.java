package TestPractice;

import java.util.Scanner;

public class NoOfVowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a sentence");
		String str=sc.nextLine();
		char[] arr={'a','e','i','o','u'};
		
		int count=0;
		 for(int i =0;i<str.length();i++) {
			 
			 for(int j=0;j<arr.length;j++) {
				 if(str.charAt(i)==arr[j]) {
					 count++;
				 }
			 }
		 }
		 
		 System.out.println(count);
		 
	}

}
