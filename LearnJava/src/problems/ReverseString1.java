package problems;

public class ReverseString1 {

	public static void main(String[] args) {
		String str="abcdefghijklmnop";
		String reverse="";
		for(int i =str.length()-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
			
		}
		System.out.println(reverse);
	}

}
