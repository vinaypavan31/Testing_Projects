package CollectionsFull;

import java.util.*;

public class DPractice {

	public static void main(String[] args) {
		//ArrayDeque<String> ad = new ArrayDeque<>();
		LinkedList<String> ad = new LinkedList<>();
		System.out.println(ad);
		//addition - offer, add, offerfirst, offerlast,addfirst,addlast,addall
		ad.add("Banana");
		ad.addFirst("cherry");
		ad.addLast("apple");
		ad.offerFirst("kiwi");
		ad.offer("pear");
		ad.offerLast("mango");
		System.out.println(ad);
		//retreival -  peek, peek first , peeklast
		
		System.out.println(ad.peek());
		System.out.println(ad.peekFirst());
		System.out.println(ad.peekLast());
		//removal-- poll, pollfirst,polllast,remove , removefirst, removelast
		System.out.println(ad.poll());
		System.out.println(ad.pollFirst());
		System.out.println(ad.pollLast());
		System.out.println(ad);
		
		

	}

}
