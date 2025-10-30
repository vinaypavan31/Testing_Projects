
public class TryreturnTest {
	int m1() // Compile time error.
	 { 
	   try {
	      System.out.println("I am in try block");
	      return 50;
	   }
	   catch(Exception e)
	   {
	     System.out.println("I am in catch block");
	   }
	   return 20;
	   //System.out.println("hi there");
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryreturnTest ft = new TryreturnTest();
		   System.out.println(ft.m1());
	}

}
