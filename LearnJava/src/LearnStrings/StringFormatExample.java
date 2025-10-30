package LearnStrings;

public class StringFormatExample {

	public static void main(String[] args) {
		String name="vinay";
		int age=25;
		float percentage = 67.1f;
		
		String a=String.format("Hi , I am %s ,I am %d yeras old and my percentage is %f", name,age,percentage);
		
		System.out.println(a);
		
		String s1="vinay";
		String s2="pavan";
		String s3="areti";
		String s=String.join(" ",s1,s2,s3);
		System.out.println(s);
	}

}
