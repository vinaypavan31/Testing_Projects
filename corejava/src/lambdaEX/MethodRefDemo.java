package lambdaEX;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class MethodRefDemo {

	public static void main(String[] args) {
		
		List<String> names=new ArrayList<>(Arrays.asList("mad^&^**an","","al^&^&*an","rose","","alex&*&*",null));
		
		//given a list of employees names given:
		//exclude the empty strings
		//remove special chars if any
		//convert to upper case
		//sort it alphabetically
		//create employee objects
		
		//names.stream().filter(Objects::nonNull).filter(x->!x.isEmpty()).map(name -> name.replaceAll("[^a-zA-Z]", "")).map(x->x.toUpperCase()).forEach(x->System.out.println(x));
		
		names.stream()
		
		//.forEach(x->System.out.println(x));
		.forEach(System.out::println);




	}

}
