package Questions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromeArrayList {

	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(4);
		ls.add(5);
		ls.add(4);
		ls.add(5);
		ls.add(2);
		ls.add(5);
		ls.add(3);
		ls.add(9);
		ls.add(7);
		ls.add(5);
		System.out.println(ls);
		Set<Integer> s=new HashSet(ls);
		System.out.println(s);
		
		

	}

}
