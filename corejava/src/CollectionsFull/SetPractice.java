package CollectionsFull;

import java.util.*;

public class SetPractice {

	public static void main(String[] args) {
		//hashset uses hashmap internally , hash map uses array of nodes
		//linked hashset internally has linked hashmap - uses link of nodes
		//creation of set 
		//treeset is not allowing nulls
		ArrayList<Integer> al=new ArrayList<>(Arrays.asList(4,5,6,7,7,6,5));
		LinkedHashSet<Integer> hs = new LinkedHashSet<>(Arrays.asList(99,80));
		
		
		hs.add(10);
		hs.add(2);
		hs.add(85);
		hs.add(65);
		hs.add(5);
		hs.addAll(al);
		hs.add(85);
		hs.add(null);
		hs.add(null);
		System.out.println( hs.remove(99));
		List<Integer> al2=new ArrayList<>();
		System.out.println( hs.contains(85));
		System.out.println(hs);
		
		for(Integer i : hs) {
			al2.add(i);
		}
		
		System.out.println(al2);
		System.out.println("********************************");
		//treeset -> treemap -> binary tree 
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(3);
		ts.add(9);
		ts.add(8);
		ts.add(32);
		ts.add(19);
		ts.add(85);
		
		//ts.add(null);
		System.out.println(ts);
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.pollFirst());
		System.out.println(ts);
		System.out.println( ts.subSet(10, 80).remove(10));
		System.out.println(ts.descendingSet());
		
		
		
		

	}

}
