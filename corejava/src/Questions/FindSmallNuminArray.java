package Questions;

public class FindSmallNuminArray {

	public static void main(String[] args) {
		int[] nums= {99,2,3,45,67,4543,54};
		
		int min=nums[0];
		for(int i=0;i<nums.length;i++) {
			if(min>nums[i]) {
				min=nums[i];
				
			}
		}
		System.out.println(min);

	}

}
