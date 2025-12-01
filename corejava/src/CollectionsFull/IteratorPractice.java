package CollectionsFull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorPractice {

	public static void main(String[] args) {
		// for all collection objects -interface-one direction - readonly with special permission for removing the elements
		
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(5,47,39,90,98,7));
		al.add(5);
		al.add(78);
		al.add(85);
		
		Iterator<Integer>it=al.iterator();
		List<Integer> li=new ArrayList<>();
		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//			//li.add(it.next());
//			it.remove();
//			
//		}
		it.next();
		it.remove();
		it.next();
		it.remove();
		
		System.out.println(al);
		
		System.out.println("**********************************************");
		
		HashMap<String,Integer> hm=new HashMap<>();
		hm.put("india", 7000);
		hm.put("pakistan", 75);
		hm.put("bangalesh", 53);
		
		Set s= hm.keySet();
		Iterator<Integer> it3= hm.values().iterator();
		//for legacy classes we can use eneumn=artion object , and convert it into iterator object and perform operations

	}

}
