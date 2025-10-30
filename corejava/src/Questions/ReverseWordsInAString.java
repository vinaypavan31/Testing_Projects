package Questions;

public class ReverseWordsInAString {

	public static void main(String[] args) {
		String text="java is coding language";
		String[] arr=text.split(" ");

		
		StringBuilder result=new StringBuilder();
		String sent="";
		for(int i=0;i<arr.length;i++) {
			String newText="";
			for(int j=arr[i].length()-1;j>=0;j--) {
				newText=newText+arr[i].charAt(j);
			}
			sent=sent+newText+" ";
		}
		
		System.out.println(sent);
		
		
		
	}

}
