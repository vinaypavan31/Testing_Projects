package Questions;

import java.util.Scanner;

public class FibinocciNumber {

	public static void main(String[] args) {
		System.out.println("Enter a range of numbers");
		Scanner sc = new Scanner(System.in);
		//0,1,1,2,3,5,8,13
		
		int num=sc.nextInt();
		int first=0; int second=1; int next = 0;
		for(int i=0;i<=num;i++) {
			
			System.out.print(first+" ");
			next=second+first;
			first=second;
			second=next;
			
			
			
			
		}
		

	}

}
