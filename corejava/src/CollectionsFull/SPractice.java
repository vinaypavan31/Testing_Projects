package CollectionsFull;

import java.util.*;

/*
 * LIFO - last in first out - Stack
 * FIFO - first in first out - Queue
 * 
 * */

//what is the default capacity of stack? - 10
//initial capacity -10
//does is allow duplicates , -yes
//does it allow null values - yes
//does it maintain insertion order - yes
//does it maintain sorted order - no
//does it offer random access of elements - yes //we dont use random access for stack 
//is it synchronized - (thread after thread -yes)
//what is it good at ?  - LIFO (uses in undo , redo , browser back , forward , )

public class SPractice {

	public static void main(String[] args) {
		
		Stack<String> books = new Stack<>();
		//by default we have to create a stack with constructor without parameters 
		
		books.push("red");
		books.push("black");
		books.push("white");
		
		//books.remove("red");
		//books.set(0,"yellow" );
//		System.out.println(books);
//		System.out.println(books.search("white"));
//		System.out.println(books.indexOf("white"));
//		System.out.println(books);
		
		System.out.println(books.isEmpty());
		System.out.println(books.empty());
		//System.out.println(books);
		//System.out.println(books.get(1));
		//System.out.println(books.contains("red"));
		//special methods available in stack are - push,pop,peek , search
		

	}

}
