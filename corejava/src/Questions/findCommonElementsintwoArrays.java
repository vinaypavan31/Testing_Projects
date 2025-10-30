package Questions;

import java.util.ArrayList;

public class findCommonElementsintwoArrays {

	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,5};
		int[] arr2= {4,5,6,7,8};
		ArrayList ls=new ArrayList();
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					ls.add(arr1[i]);
				}
			}
		}
		
		System.out.println(ls);

	}

}
