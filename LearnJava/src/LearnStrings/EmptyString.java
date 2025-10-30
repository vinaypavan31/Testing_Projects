package LearnStrings;

public class EmptyString {

	public static void main(String[] args) {
		
		 String str = ""; // Empty string.
		  boolean isEmpty1 = str.isEmpty();
		  System.out.println("Is String empty: " +isEmpty1);

		  String str2 = "     ";
		  boolean isEmpty2 = str2.isEmpty();
		  System.out.println("Is String empty: " +isEmpty2);
		  
		  String str3 = "     ";
		  boolean isBlank = str2.isBlank();
		  System.out.println("Is String blank: " +isBlank);
		  
		  String name="aretiramasaiadivenktavinaypavan";
		  boolean cont=name.contains("adi");
		  System.out.println("does name contains adi:"+cont);
		  
		  String n1="krishna";
		  String n2="Rama";
		  int num=n1.compareToIgnoreCase(n2);
		  System.out.println(num);
	}

}
