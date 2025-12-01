package lambdaEX;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods {
	public static void main(String[] args) {
		
		List<Integer> numbers=new ArrayList(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		
		//numbers.stream().forEach(x->System.out.println(x));
		
		//numbers.stream().filter(e -> e%2==0).forEach(x->System.out.println(x));
		
		//numbers.stream().map(x->x*x).forEach(x->System.out.println(x));
		
		//numbers.stream().map(x->"number :"+x).forEach(x->System.out.println(x));
		
		//numbers.stream().map(x->List.of(x*2,x*5,x*8)).forEach(e->System.out.println(e));
		
		//numbers.stream().flatMap(x->Stream.of(x*2,x*5,x*8)).forEach(e->System.out.println(e));
		
		//System.out.println( numbers.stream().reduce(0, (e,carry)-> e+carry ));
		
		//System.out.println( numbers.stream().filter(x->x%2==0).map(x->x*x).reduce(1,(e,carry)->e*carry));
		
		//System.out.println( numbers.stream().filter(x->x%2==0).mapToInt(x->x*x).sum());
		
		//System.out.println( numbers.stream().filter(x->x%2==0).peek(e->System.out.println(e)).mapToInt(x->x*x).sum());
		
		//int[] nums=numbers.stream().filter(x->x%2==0).mapToInt(x->x*2).toArray();
		
		/*List<Integer> integerNums=numbers.stream().filter(x->x%2==0).map(x->x*2).toList();
		System.out.println(integerNums);*/
		
//		Set<Integer> collect=numbers.stream().filter(x->x%2==0).map(x->x*2).collect(Collectors.toSet());
//		System.out.println(collect);
		
//		System.out.println( numbers.stream().allMatch(e->e%2==0));
//		
//		System.out.println( numbers.stream().anyMatch(e->e%2==0));
//		
//		System.out.println( numbers.stream().noneMatch(x->x%2==0));
		
		//System.out.println(numbers.stream().filter(e -> e>4).filter(e->e%2==0).count()); 
		
		//numbers.stream().distinct().forEach(e->System.out.println(e));
		
		//System.out.println( numbers.stream().filter(e -> e>3).filter(e->e%2==0).findAny());
		//System.out.println( numbers.stream().filter(e -> e>3).filter(e->e%2==0).findFirst());
		
		//numbers.stream().skip(3).limit(5).forEach(x->System.out.println(x));
		
		
		//List<Integer> nums=new ArrayList(Arrays.asList(10,3,2,4,5,6,8,9,7,11,1));
		//nums.stream().sorted().forEach(x->System.out.println(x));
		//nums.stream().sorted((e1,e2)->e2-e1).forEach(e->System.out.println(e));
		
		
		
		
	}
}
