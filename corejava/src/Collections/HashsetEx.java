package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetEx {

	public static void main(String[] args) {
		
		HashSet<String> hs=new HashSet<String>();
		
		hs.add("ram");
		hs.add("sai");
		hs.add("adi");
		hs.add("sam");
		hs.add("dam");
		System.out.println(hs);
//		System.out.println(hs);
//		hs.add("api");
//		System.out.println(hs);
//		hs.add("adi");
//		System.out.println(hs);
//		hs.remove("adi");
//		System.out.println(hs);
//		System.out.println( hs.isEmpty());
		
		//iterator
		Iterator<String> i=hs.iterator();
		//System.out.println(i.next());
		
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		

	}

}
