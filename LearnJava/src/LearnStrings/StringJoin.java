package LearnStrings;

import java.util.StringJoiner;

public class StringJoin {

	public static void main(String[] args) {
		StringJoiner joiner = new StringJoiner(", ");
		
		joiner.add("apple");
		joiner.add("banana");
		joiner.add("cherry");
		joiner.add("mango");
		
		System.out.println("joiner : "+joiner);
	}

}
