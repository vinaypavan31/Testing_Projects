package LearnArrays;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		
//		String[] cities= {"tokyo","delhi","beijing","paris","lisbon"};
//		String city="delhi"; 
//		int flag=0;
//		for(int i=0;i<cities.length;i++) {
//			if(cities[i]==(city)) {
//				flag=1;
//				break;
//			}
//		}
//		if(flag==1)
//			System.out.println(city+" is present in the array");
//		else
//			System.out.println(city+" is not present in array");
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter 10 values : ");
		int[] arr = new int[10];
		int flag=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		System.out.println("enter the number you want to search :");
		
		int num=sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==num) {
				flag=1;
				break;
			}
		}
		if(flag==1)
			System.out.println(num+" is present");
		else
			System.out.println(num+" is not present");
	}

}
