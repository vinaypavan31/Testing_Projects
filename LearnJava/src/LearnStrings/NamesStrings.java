package LearnStrings;

public class NamesStrings {

	public static void main(String[] args) {
		String name="areti ram";
		StringBuffer name1=new StringBuffer(name);
		name1.append(" sai");
		name1.delete(0, 5);		
		name1.deleteCharAt(0);
		System.out.println(name1);
		
		name1.replace(0, 4, "swamy");
		name1.append("mymy,mymy");
		System.out.println(name1);
		int num =name1.indexOf("my",5);
		int num1=name1.lastIndexOf("y");
		System.out.println(num);
		System.out.println(num1);
		
		StringBuffer str5=new StringBuffer("malayalam");
		
		String str6=str5.reverse().toString();
		String hulk ="hulk";
		System.out.println(str5.hashCode());
		System.out.println(str6.hashCode());
		System.out.println(hulk.getClass());
		
	}

}
