
package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseAnArray {

	public static void main(String[] args) {
		int[] arr= {2,4,6,7,8,9,30};
		
		System.out.println(Arrays.toString(arr));
		
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			
			start++;
			end--;
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
	

}
