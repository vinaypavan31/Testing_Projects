package arraysjava;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		
		int b[][]= {{2,4,5},{3,0,7},{11,2,9}};
		int min=b[0][0];
		for(int i =0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(b[i][j]>min) {
					min=b[i][j];
					
				}
			}
			
		}
		System.out.println(min);
	}

}
