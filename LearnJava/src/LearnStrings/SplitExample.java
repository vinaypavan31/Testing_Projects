package LearnStrings;

public class SplitExample {

	public static void main(String[] args) {
		String str = "I love Java Technology";
		   String[ ] s;
		       s = str.split(" ");
		   int length = s.length;
		   for(int i = 0;  i < length; i++) {
			  System.out.println(s[i]);
		   }
		   
		   char[] arr= new char[]{'h','u','l','k','i','s','b','i','g'};
		   String he=new String(arr,4,4);
		   System.out.println(he);
	}

}
