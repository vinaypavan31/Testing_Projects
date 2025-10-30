package Questions;

import java.util.ArrayList;
import java.util.List;

public class FindLargeNumInArray {

	public static void main(String[] args) {
		int[] arr= {4,33,54,678,9434,8,44,78,90,2};
		
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		
		System.out.println(max);

	}

}
