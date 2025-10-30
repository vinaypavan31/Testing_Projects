package LearnArrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

public class DecArray {

	public static void main(String[] args) {
		
//		String[] arr1;
//		String arr2[];
//		arr1= new String[10];
//		arr2= new String[11];
//		
//		int arr3[]=new int[5];
//		
//		arr3[0]=1;
//		arr3[1]=11;
//		arr3[2]=111;
//		arr3[3]=1111;
		
		//char[] city = {'D','h','a','n','b','a','d'};
		//System.out.println(Arrays.toString(city));
		
//		Scanner  sc = new Scanner(System.in);
//		int[] nums=new int[5];
//		System.out.println("Enter five numbers:");
//		for(int i =0;i<nums.length;i++) {
//			nums[i]=sc.nextInt();
//			
//		}
//		int sum=0;
//		for(int i=0;i<nums.length;i++) {
//			sum=sum+nums[i];
//		}
//		System.out.println(sum);
		Student[] sts=new Student[]{new Student("ram",20), new Student("sai",40),new Student("adi",90)};
		for(int i=0;i<sts.length;i++) {
			System.out.println("Name : "+sts[i].name +"     Age : "+sts[i].age);
		}
	}

}
