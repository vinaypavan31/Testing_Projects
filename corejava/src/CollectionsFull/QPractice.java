package CollectionsFull;

import java.util.*;
//what is the default capacity of priorityqueue? - 11
//initial capacity -11
//does is allow duplicates , -yes
//does it allow null values - no
//does it maintain insertion order - no
//does it maintain sorted order - no
//does it offer random access of elements - no
//is it synchronized - no, anything in queue is not synchronized
//what is it good at ? -  to perform FIFO operations


public class QPractice {

	public static void main(String[] args) {
		//Priority Queue
		Integer[] arr = new Integer[] {2,3,1,4};
		 ArrayList al = new ArrayList(Arrays.asList(arr));
		 Queue<Integer>  pq = new PriorityQueue<>(Comparator.reverseOrder());
		 //addtion - add , addall, offer
		 System.out.println(pq);
		 pq.add(11);
		 pq.addAll(al);
		 pq.offer(9);
		  
		 //retreival - peek
		 
		 
		 //removal - poll, remove
		 
		 
		 System.out.println(pq);
		 System.out.println(pq.peek());
		 System.out.println(pq);
		 System.out.println(pq.poll());//removes element -if queue is empty  prints null
		 System.out.println(pq);
		 System.out.println(pq.remove());//if empty queue runs this - gives exception(nosuchelementexception)
		 System.out.println(pq);
		 
		 System.out.println( pq.contains(3));
		 
		 while(!pq.isEmpty()) {//no foreach for this - if it is used ,then it word print numbers order wise
			 System.out.println(pq.poll());
		 }
		 
		 pq.clear();
		 System.out.println(pq);
	}

}
