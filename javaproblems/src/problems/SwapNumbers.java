package problems;

public class SwapNumbers {

	public static void main(String[] args) {
		// without third variable
		
		int v=10;
		int k=45;
		System.out.println("Before swaping k : "+k+" v : "+v);
		
		v=v+k;//45+10,v=55
		k=v-k;//55-45,k=10
		v=v-k;
		
		System.out.println("After swaping k : "+k+" v : "+v);
		
		//using 3rd variable
		
		int a=90;
		int b=43;
		int c;
		System.out.println("Before swaping a : "+a+" b : "+b);
		
		c=a+b;//90+43
		b=c-b;//90+43-43
		a=c-b;
		
		
		
		System.out.println("After swaping a : "+a+" b : "+b);
		
	}

}
