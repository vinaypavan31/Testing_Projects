package lambdaEX;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MySampleClass2 {
		public static void main(String[] args) {
	//String[ ] names= {"areti","ram","sai","adi","venkata","vinay","pavan"};
	List<String> names=new ArrayList<String>(Arrays.asList("areti","ram","sai","adi","venkata","vinay","pavan"));
	
	names.stream().filter(x->x.startsWith("v")).map(x->x.substring(0,3)).forEach(x-> System.out.println(x));
	
}
}