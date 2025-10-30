package TestPractice;

public class RotationOfString {

	public static void main(String[] args) {
		String str4="abcde";
		String str5="bcdea";
		if(str4.length() != str5.length())
		   {
		      System.out.println("Second string is not rotation of first string.");	 
		   }
		   else {
		str4=str4.concat(str4);
		if(str4.indexOf(str5)!=-1) {
			System.out.println(str4.indexOf(str5));
			System.out.println("Second string is rotation of first string.");
		}
		else
			System.out.println("Second string is not rotation of first string.");
	}

}}
