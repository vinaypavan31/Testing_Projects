package arraysjava;

public class MaxMin {

	public static void main(String[] args) {
		
		int b[][]= {{22,4,5},{3,14,10},{11,2,9}};
		int min=b[0][0];
		int col=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(b[i][j]<min) {
					min=b[i][j];
				col=j;
				}
			}
		}
		
		int max=b[0][col];
		for(int i=0;i<3;i++) {
			if(b[i][col]>max) {
				max=b[i][col];
			}
		}
		
		System.out.println("minimum:"+min+"maximum:" +max);
	}

}
