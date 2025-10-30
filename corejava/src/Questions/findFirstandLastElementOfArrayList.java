package Questions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class findFirstandLastElementOfArrayList {

	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		HashSet<String> f=new HashSet<String>();
		f.add("apple");
		f.add("mango");
		f.add("cherry");
		f.add("banana");
		f.add("dates");
		f.add("fig");
		ls.addAll(f);
		System.out.println(ls);
		System.out.println(ls.get(0));
		System.out.println(ls.get(ls.size()-1));
		
		

	}

}
