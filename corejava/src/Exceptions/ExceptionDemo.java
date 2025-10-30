package Exceptions;

public class ExceptionDemo {
	
	
	
	public static void main(String[] args) {
		int a=4;
		
		int b=7;
		
		int c=0;
		try {
		int k=b/c;}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

}
 