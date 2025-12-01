package CollectionsFull;

import java.util.*;
import java.util.ListIterator;

public class ListIteratorPractice {

	public static void main(String[] args) {
		// introduced to iterating only list implementing classes - bidirectional - read and write permissions 
		
		Vector<Integer> al = new Vector<>();
		al.add(4);
		al.add(45);
		al.add(89);
		al.add(35);
		
		ListIterator<Integer> li=al.listIterator();
		
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		li.add(78);
		System.out.println("*************************");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		li.remove();
		System.out.println(al);
		//System.out.println(li);
		

	}

}
