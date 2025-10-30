package expe;

public class Arrayreverse {

	public static void main(String[] args) {
		String[] names= new String[]{"ram","sai","adi","venkata"};
		StringBuilder name=new StringBuilder(names[0]);
		String editedName=name.reverse().toString();
		
		System.out.println(editedName);
		for(String n:names) {
			System.out.println(n);
			
		}
		
		String n1="ramsai";
		String n2=n1;
		System.out.println(n2+ "         "+n1);
		
		for(int i=names.length-1;i>=0;i--) {
			System.out.println(names[i]);
		}
		
		
	}

}
