package CollectionsFull;

import java.util.*;
//what is the default capacity of vector? - 10
//initial capacity -10
//does is allow duplicates , -yes
//does it allow null values - yes
//does it maintain insertion order - yes
//does it maintain sorted order - no
//does it offer random access of elements - yes
//is it synchronized - (thread after thread -yes)
// what is it good at ? - multi threading, when data increases exponentially


public class VPractice {

	public static void main(String[] args) {
		
		Vector v1 = new Vector();
		
		v1.add("yadagiri");
		v1.add("jeevan");
		v1.add(0,"raj");
		
		Vector v2 = new Vector();
		v2.add("hamesh");
		v2.add("suresh");
		//System.out.println(v1);
//		for(int i=0;i<v2.size();i++) {
//			v1.add(v2.get(i));
//		}
//		
		v1.addAll(0,v2);
		
		//System.out.println(v1.get(2));
		
		//v1.remove(0);
		//v1.remove("raj");
		//v1.removeAll(v2);
		//v1.clear();
		Vector v3 = new Vector();
		v3.add("suresh");
		v3.add("hamesh");
		
		//System.out.println( v1.contains("jeevanb"));
		//System.out.println(v1.containsAll(v3));
		//System.out.println(v1);
		v1.set(0,"arjun");
		v1.add("raj");
		//System.out.println(v1.lastIndexOf("raj"));
		//System.out.println( v1.indexOf("raj"));
		
		//System.out.println(v1.isEmpty());
		
		//System.out.println(v1.firstElement());
		//System.out.println(v1.lastElement());
		Object[] arr1=v1.toArray();
		System.out.println(Arrays.toString(arr1));
		
		
		
		
		
		System.out.println(v1);
		System.out.println("size : "+v1.size());
		System.out.println("capacity : "+v1.capacity());
		System.out.println("**********************************************");
		Object[] arr = new Object[]{1,2,3,4,5,6};
		
		Vector<Integer> v4 = new Vector<>();
		//v4.add("add");
		//v4.add(4.44);
		v4.add(20);
		v4.add(null);
		v4.add(null);
		v4.add(20);
		int sum=0;
//		for(int i=0;i<v4.size();i++) {
//			sum+=(Integer)v4.get(i);
//		}
		//System.out.println(sum);
		System.out.println(v4);
		System.out.println("size : "+v4.size());
		System.out.println("capacity : "+v4.capacity());
		
		
		
	}

}
