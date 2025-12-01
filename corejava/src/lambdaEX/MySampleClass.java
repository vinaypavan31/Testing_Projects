package lambdaEX;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MySampleClass {
		public static void main(String[] args) {
	//String[ ] names= {"areti","ram","sai","adi","venkata","vinay","pavan"};
	List<String> names=new ArrayList<String>(Arrays.asList("areti","ram","sai","adi","venkata","vinay","pavan"));
	names.forEach(x->System.out.println(x));
	System.out.println("********");
	Collections.sort(names,(e1,e2)->e1.compareTo(e2));
	names.forEach(e->System.out.println(e));
	
}
}