package LearnStrings;

import java.util.Arrays;

public class SubstringsTask {

	public static void main(String[] args) {
		
//		String str="hello world";
//		String str1=str.substring(0,5);
//		String str2=str.substring(6,11);
//		String str3=str.substring(6);
//		System.out.println(str1);
//		System.out.println(str2);
//		System.out.println(str3);
		
		
//		 String text = "My name is Deepak. I am 26 years old. I live in Dhanbad.";
//		 String[] str= text.split("\\.");
//		 System.out.println(Arrays.toString(str));
//		 
		 
		String sent="i live in chennai city";
		System.out.println(sent.isEmpty());
		System.out.println(sent.length());
		System.out.println(sent.replace("i", "I"));
		char[] ca=sent.toCharArray();
		System.out.println(ca);
		
		String[] arr=sent.split(" ");
		System.out.println(Arrays.toString(arr));
		String d="";
		for(String a : arr) {
			String b= a.substring(0,1).toUpperCase();
			String c=b+a.substring(1);
			System.out.println(c);
			
			d=d+" "+c;
		
		}
		System.out.println(d.trim());
		System.out.println("ikol"+9+8+9);

	}

}
