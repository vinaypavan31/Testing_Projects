package lambdaEX;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsDemo {

	public static void main(String[] args) {
		List<Employee> employees=EmployeeData.get();
		
		//employees.stream().forEach(x->System.out.println(x));
		
		//employees.stream().filter(x->x.getSalary()>60000.00).filter(x->x.getLastName().startsWith("D")).forEach(x->System.out.println(x));
		
		//sort by firstname
//		employees.stream()
//		.sorted((e1,e2)->e1.getFirstName().compareTo(e2.getFirstName()))
//		.forEach(x->System.out.println(x));
		
		//employees.stream().map(x->x.getFirstName()).sorted().forEach(x->System.out.println(x));
		
		//System.out.println( employees.stream().filter(x->x.getDepartment().equalsIgnoreCase("IT")).count());
		
		//System.out.println( employees.stream().filter(x->x.getDepartment().equalsIgnoreCase("IT")).mapToDouble(x->x.getSalary()).sum());
		
		//System.out.println( employees.stream().filter(x->x.getDepartment().equalsIgnoreCase("IT")).map(x->x.getSalary()).reduce(0.0,(e,carry)->(e+carry)));
		
		//System.out.println( employees.stream().mapToDouble(x->x.getSalary()).max());
		
//		List<String> empNames=employees.stream().map(x->x.getFirstName()).collect(Collectors.toList());
//		empNames.add("ramsai");
//		System.out.println(empNames);
		
		//immutable list
		
//		List<String> empNames=employees.stream().map(x->x.getFirstName()).collect(Collectors.toUnmodifiableList());
//		empNames.add("ramsai");
//		System.out.println(empNames);
		
		
		//map name as key and salary as value
		
		Map<String,Double> empMap=employees.stream().collect(Collectors.toMap(e->e.getFirstName(), e->e.getSalary(),(a,b)->a));
		System.out.println(empMap);
		
		Map<String,String> empMap2=employees.stream().collect(Collectors.toMap(e->e.getFirstName(), e->e.getDepartment(),(a,b)->b+" and "+a));
		System.out.println(empMap2);
		

	}

}
