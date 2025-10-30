package problems;

public class SwapTwoStrings {

	public static void main(String[] args) {
		//using 3rd variable
		String s1="csk";
		String s2="m1";
		
		System.out.println(s1 +" vs "+s2);
		
		String temp=s1;
		s1=s2;
		s2=temp;
		
		System.out.println(s1 +" vs "+s2);
		
		String s3="love";
		String s4="you";
		System.out.println("Before swapping, s3 = " +s3+ ", s4 = "+s4 );
		s3=s3+s4;
		s4=s3.substring(0,s3.length()-s4.length());
		s3=s3.substring(s4.length());
		System.out.println("After swapping, s3 = " +s3+ ", s4 = "+s4 );
	}

}
