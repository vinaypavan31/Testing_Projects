
public class ThrowTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaring a try-catch block.
		try
		{
		// Creating an object of ArithmeticException class. 
		   ArithmeticException a = new ArithmeticException("Hello from throw"); // Line 7
		   throw a; // Exception thrown explicitly. // Line 8

		 // Line 7 and 8 can be written also in one line like this:
		 // throw new ArithmeticException("Hello from throw");
		}
		catch(ArithmeticException ae)
		{
		   System.out.println("ArithmeticException caught: \n" +ae);
		   System.out.println(ae.getMessage());
		  }
	}

}
