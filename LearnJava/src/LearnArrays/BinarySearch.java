package LearnArrays;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[ ] arr = {7, 10, 18, 21, 35, 45, 48, 50};
		   int i = BinarySearch.searchNum(arr, 7, 45); // returns 5.
		   System.out.println("Element found in the array at the index location " + i);
		 
		   int j = BinarySearch.searchNum(arr, 7, 56); // returns -1.
		   System.out.println(j+" indicates that element not found in the array");
		   int k = BinarySearch.searchNum(arr, 7, 15); // returns -1.
		   System.out.println(k+" indicates that element not found in the array");
		   int l = BinarySearch.searchNum(arr, 7, 10); // returns 1.
		   System.out.println("Element found in the array at the index location " +l);
		

	}
	
	
	
	public static int searchNum(int[] arr, int n,int key) {
		int lowIndex=0;
		int highIndex=n-1;
		int midIndex;
		
		while(highIndex>=lowIndex) {
			midIndex=(highIndex+lowIndex)/2;
			
			if(key==arr[midIndex])
				return midIndex;
			if (key < arr[midIndex])
				highIndex=midIndex-1;
			else
				lowIndex=midIndex+1;
		}
		return -1;
	}
	

}
