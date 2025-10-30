package problems;

import java.util.ArrayList;

public class CountingVowels {
	
	ArrayList al;
	
	CountingVowels()
	{
	al=new ArrayList();
	al.add('a');
	al.add('A');
	al.add('e');
	al.add('E');
	al.add('i');
	al.add('I');
	al.add('o');
	al.add('O');
	al.add('u');
	al.add('U');
	}
	
	private boolean isVowel(char c) {
		for(int i =0;i<al.size();i++) {
			if((Object)c == al.get(i)) {
				return true;
			}
		}
		return false;
	}
	public int countVowels(String str){
		int countVowel = 0; // storing total number of vowels.  
	      int size = str.length(); // size or length of string.  
	      for(int j = 0; j < size; j++)  
	      {  
	        char c = str.charAt(j);  
	        if(isVowel(c))  
	        {  
	     // If a vowel is found!, increase the count by 1.  
	          countVowel = countVowel + 1;  
	         }  
	       }  
	      return countVowel;  
		
		
	}

	public static void main(String[] args) {
		 CountingVowels cv = new CountingVowels();  
	     String s = "Scientech Easy is a great site to learn Java programming.";    
	     int noOfVowel = cv.countVowels(s);  
		  
	     System.out.println("Given string: " + s);  
	     System.out.println("Total number of vowels in the given string: "+ noOfVowel + "\n");    
	   
	     s = "Every person loves his country";
	     System.out.println("Given string: " +s);
	     noOfVowel = cv.countVowels(s);
	     System.out.println("Total number of vowels in the given string: " +noOfVowel);
	}

}
