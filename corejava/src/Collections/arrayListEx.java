package Collections;

import java.util.ArrayList;

public class arrayListEx {

	public static void main(String[] args) {
		
		ArrayList<String> a=new ArrayList<String>();
		a.add("areti");
		a.add("vinay");
		
		System.out.println(a);
		a.add(0,"Mr");
		System.out.println(a);
		a.remove(1);
		a.add("ram");
		a.add("ram");
		a.add("sai");
		a.add("adi");
		a.add("pavan");
		System.out.println(a);
		a.remove("Mr");
		System.out.println(a);
		System.out.println( a.get(2));
		System.out.println(a.contains("vina"));
		System.out.println( a.indexOf("vinay"));
		System.out.println(a.size());
		
		
		

	}

}
