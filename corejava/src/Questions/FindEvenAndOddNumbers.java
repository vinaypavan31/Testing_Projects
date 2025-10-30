package Questions;

import java.util.ArrayList;
import java.util.List;

public class FindEvenAndOddNumbers {

	public static void main(String[] args) {
		int[] nums= {1,2,3,43,67,44,88,77,67,89,70,80,66,5,23};
		List<Integer> even=new ArrayList<Integer>();
		List<Integer> odd=new ArrayList<Integer>();
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2==0) {
				even.add(nums[i]);
			}
			else {
				odd.add(nums[i]);
				
			}
		}
		
		System.out.println(even);
		System.out.println(odd);

	}

}
