
package CollectionsFull;

import java.util.*;
//what is the default capacity of linkedlist? - 0
//initial capacity -0
//does is allow duplicates , -yes
//does it allow null values - yes
//does it maintain insertion order - yes
//does it maintain sorted order - no
//does it offer random access of elements - yes
//is it synchronized - no, by using collections class we can make it synchronized -Collections.synchronizedList(al1)
//what is it good at ? -  when data not increases exponentially
//linked list is used to update data, insert in middle

public class LLPractice {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<>();
		al.add("s1");
		al.add("s2");
		LinkedList<String> ll1=new LinkedList<>();
		ll1.add("Y1");
		ll1.add("Y2");
		ll1.add("Y3");
		ll1.add(1,"YY");
		ll1.addAll(1,al);
//		ll1.remove(1);
//		ll1.remove("YY");
//		ll1.clear();
		
		//ll1.removeAll(al);		
		System.out.println(ll1);
		
		
	}

}
