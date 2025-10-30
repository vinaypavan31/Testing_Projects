package LearnArrays;

public class SumOf2DArray {

	public static void main(String[] args) {
		int[][] arr= {{1,2,3,4},{8,3,5,6},{4,8,9,7}};
		
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sum=sum+arr[i][j];
			}
		}
		System.out.println("Sum : "+sum);
		
		
		for (int j = 0; j < arr[0].length; j++) 
		   {
		     int total = 0;
		     for (int i = 0; i < arr.length; i++)
			total += arr[i][j];
			System.out.println("Sum of elements in column " + j + " is " + total);
		   }
	}

}
