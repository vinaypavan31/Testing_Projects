package CollectionsFull;

import java.util.*;
//what is the default capacity of arraylist? - 0
//initial capacity -10
//does is allow duplicates , -yes
//does it allow null values - yes
//does it maintain insertion order - yes
//does it maintain sorted order - no
//does it offer random access of elements - yes
//is it synchronized - no, by using collections class we can make it synchronized -Collections.synchronizedList(al1)
//what is it good at ? -  when data not increases exponentially
//arraylist and vector are used for retqrival and addding elements , while adding if we use index add method , performance decreases
public class ALPractice {

	public static void main(String[] args) {
		Integer[] arr = new Integer[]{1,2,3,4,5,6};
		ArrayList<Integer> al1=new ArrayList(Arrays.asList(arr));
		//al1.add(5);
		
		
		System.out.println(al1);
		
		System.out.println(al1.size());
		System.out.println();

	}

}
//Major operations 
//creation of list - List<data type> varname=new list<>();
//addition of elements to list - varname.add(element); - varname.addall(collection)- varname.add(index,element) - varname.addall(index,collection)
// retrieval of elements - varname.get(index)  varname.get(element) - 
//deletion of elements - varname.remove(index)- varname.clear() -varname.removeall()
//verification of elements varname.contains(element)
//updation of element - varname.set(index,element)









