package CollectionsFull;

import java.util.*;
import java.util.Map.Entry;

public class MPractice {

	public static void main(String[] args) {
		
		//Map m = new Hashtable();
		Map<Integer,String> m = new LinkedHashMap<>();
		//addition
		m.put(500050, "Hyderabad");
		m.put(600097,"Chennai");
		m.put(409980, "Delhi");
		m.put(123456, "Kolkata");
		
		//retreival of keys
		
		Set<Integer> keys=m.keySet();
		for(Integer key : keys ){
			System.out.println(key);
		}
		
		
		//retreival of values
		Collection<String> values=m.values();
		for(String v : values ){
			System.out.println(v);
		}
		
		//retrival of value using key
		String value=m.get(600097);
		System.out.println(value);
		
		for(Integer key:keys) {
			System.out.println(key+"-------"+m.get(key));
		}
		
//		System.out.println(m);
//		m.remove(600097,"Chennai");
//		System.out.println(m);
		
		System.out.println( m.containsKey(600097));
		System.out.println(m.containsValue("Hyderabad"));
		
		System.out.println(m);
		m.putIfAbsent(600097, "Noida");
		//m.put(600097, "Noida");
		m.replace(123456, "Mumbai");
		
		
		m.clear();
		System.out.println(m);
		System.out.println(m.size());
		
		Set<Entry<Integer,String>> entries=m.entrySet();
		
		for(Entry<Integer,String> entry : entries) {
			Integer key =entry.getKey();
			String valu=entry.getValue();
			System.out.println(key+    "            "+valu);
		}
		
		
	}

}
