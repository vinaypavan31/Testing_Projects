package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test1 {

	// count the number of names starting with alphabet A in list

	@Test
	public void regular() {
		ArrayList<String> names = new ArrayList<String>();

		names.add("Areti");
		names.add("Abram");
		names.add("sai");
		names.add("adi");
		names.add("venkata");
		names.add("vinay");
		names.add("pavan");
		int count = 0;
		for (int i = 0; i < names.size(); i++) {
			String actual = names.get(i);

			if (actual.startsWith("A") || actual.startsWith("a")) {

				count++;

			}

		}
		System.out.println(count);

	}
	
	@Test
	public void streamFilter() {

		ArrayList<String> names = new ArrayList<String>();

		names.add("Areti");
		names.add("Abram");
		names.add("sai");
		names.add("adi");
		names.add("venkata");
		names.add("vinay");
		names.add("pavan");

		// there is no life for intermediate operation if there is no terminal operation
		// terminal operation will execute only if intermediate operation (filter)
		// returns true
		// we can create a stream
		// how to use filter in stream API
		//

		Long c = names.stream().filter(s -> s.startsWith("A") || s.startsWith("a")).count();
		System.out.println(c);

		Long d = Stream.of("abhijeet", "Alekya", "Adam", "bali", "Ram", "Baba").filter(n ->

		n.startsWith("A")).count();

		System.out.println(d);

		// print all the names of arraylist

		names.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));
		
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
	}
	
	@Test
	public void streamMap() {
		
		ArrayList<String> names = new ArrayList<String>();

		
		names.add("sai");
		names.add("adi");
		names.add("venkata");
		names.add("vinay");
		names.add("pavan");
		//print names which have last letter as "a" with uppercase 
		
		Stream.of("Abhijeet","Don","Alekhya","Adam","Rama")
		.filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//print names which have first letter as a with uppercase and sorted
		
		List<String> names1=Arrays.asList("Azbhijeet","Don","Alekhya","Adam","Rama");
		System.out.println("*************************");
		names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		System.out.println("*************************");
		//merging two different lists
		Stream<String> newStream=Stream.concat(names.stream(), names1.stream());
		//newStream.sorted().forEach(s->System.out.println(s));
		boolean flag=newStream.anyMatch(s->s.equalsIgnoreCase("Adam"));
		System.out.println(flag);
		Assert.assertTrue(flag);
		
	}
	
	
}