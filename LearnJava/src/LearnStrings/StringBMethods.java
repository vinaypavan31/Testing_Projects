package LearnStrings;

public class StringBMethods {

	public static void main(String[] args) {
		
		StringBuffer str=new StringBuffer();
		
		str.append("abcdefghij");
		
		System.out.println(str.length());
		System.out.println(str.capacity());
		System.out.println(str.charAt(9));
		System.out.println(str.delete(0,2));
		
		StringBuffer str2=new StringBuffer("abcdefghij");
		
		char[] c1=new char[15];
		
		str2.getChars(0, 7, c1, 2);
		
		
		System.out.println(str2);
		System.out.println(c1);
		
		for (int i=0 ;i<c1.length;i++) {
            System.out.println(c1[i]);
        }
		
		
		String name="aretiram";
		StringBuffer name1=new StringBuffer(name);
		
		System.out.println(name1);
		System.out.println();
		System.out.println();
		System.out.println();

	}

}
