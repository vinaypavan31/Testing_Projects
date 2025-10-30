package TestPractice;

import java.util.Scanner;

public class NoOfWordsInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a sentence");
		String str= sc.nextLine();
		String[] arr=str.split(" ");
		
		System.out.println(arr.length);
		

	}

}
