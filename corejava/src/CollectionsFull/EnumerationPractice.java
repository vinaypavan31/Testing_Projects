package CollectionsFull;

import java.util.*;

//enumeration is a interface introduced to iterate the legacy(Vector,Stack,Dictionary,Properties,HashTable) collection objects v1.0
public class EnumerationPractice {

	public static void main(String[] args) {
		List<String> al=Arrays.asList("ram","sai","adi","venkata","pavan","vinay","areti");
		Stack<String> v= new Stack<>();
		v.addAll(al);
		Enumeration<String> e=v.elements();
		
		//e.hasMoreElements()
		//e.nextElement()
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		Hashtable<String,Integer> hs = new Hashtable<>();
		hs.put("india", 7000);
		hs.put("pakistan", 75);
		hs.put("bangalesh", 53);
		
		Enumeration<Integer> e1=hs.elements();
		while(e1.hasMoreElements()) {
			System.out.println(e1.nextElement());
		}
		
		Properties prop=new Properties();
		prop.setProperty("url", "localhost");
		prop.setProperty("username", "admin");
		
		Enumeration<Object> e2= prop.elements();
		
		while(e2.hasMoreElements()) {
			System.out.println(e2.nextElement());
		}
		System.out.println("**************************");
		Iterator<String> it=v.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()); 
		}
		
	}

}
