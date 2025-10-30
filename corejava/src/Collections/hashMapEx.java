package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMapEx {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(0, "rsa");
		hm.put(1, "ind");
		hm.put(2, "drc");
		hm.put(10, "uae");
		hm.put(11, "uk");
		hm.put(12, "usa");
		
//		System.out.println(hm.values());
//		System.out.println(hm.get(2));
//		System.out.println(hm.get(1));
//		hm.remove(1);
//		System.out.println(hm.get(1));
		//System.out.println( hm.entrySet());
		Set s =hm.entrySet();
		
		Iterator it=s.iterator();
		while(it.hasNext()) {
			Map.Entry mp=(Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		

	}

}
