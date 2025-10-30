package LearnArrays;

public class Descend {

	public static void main(String[] args) {
		char temp;  
		  char ch[] = {'s', 'c', 'i', 'e', 'n', 't', 'f', 'a', 'b', 'z', 'p'}; // Initializing char elements in the array.
		  for (int i = 0; i < ch.length; i++)   
		  {  
		     for (int j = i + 1; j < ch.length; j++)   
		     {  
			if (ch[i] < ch[j])   
			{  
			   temp = ch[i];  
			   ch[i] = ch[j];  
			   ch[j] = temp;  
			}  
		     }  
		  }  
		  System.out.println("Sorting array elements in descending order:");  
		// Accessing elements of the array one by one.
		   for (int i = 0; i <= ch.length - 1; i++)   
		   {  
		     System.out.println(ch[i]);  
		   }  

	}

}
