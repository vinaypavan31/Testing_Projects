package lambdaEX;

import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectorsDemo {

	public static void main(String[] args) {
		List<Employee> employees = EmployeeData.get();
		
		//concat the first names of all the employees
		//String empFirstNameJoined=employees.stream().map(x->x.getFirstName()).distinct().collect(Collectors.joining(", "));
		
		//System.out.println(empFirstNameJoined);
		
		
		//split the list based on salary >60000.00
//		Map<Boolean,List<Employee>> empListBySalary25K= employees.stream().collect(Collectors.partitioningBy(e->e.getSalary() > 60000.00));
//		
//		System.out.println(empListBySalary25K);
		
//		Map<Boolean, Long> empsCountBySalary25K= employees.stream().collect(Collectors.partitioningBy(e->e.getSalary() > 60000.00,Collectors.counting()));
//		
//		System.out.println(empsCountBySalary25K);
		
//		Map<String, List<Employee>> employeesByDept =employees.stream().collect(Collectors.groupingBy(e->e.getDepartment()));
//		
//		System.out.println(employeesByDept );
		
//		Map<String, Long> NoOfemployeesByDept =employees.stream().collect(Collectors.groupingBy(e->e.getDepartment(),Collectors.counting()));
//		System.out.println(NoOfemployeesByDept );
		
//		Map<String,List<String>> empsNamesByDept= employees.stream()
//		.collect(Collectors.groupingBy(x->x.getDepartment(),
//				Collectors.mapping(e->e.getFirstName(),Collectors.toList())));
//		
//		System.out.println(empsNamesByDept);
		
//		Map<String, Optional<Double>> result = employees.stream()
//			    .collect(Collectors.groupingBy(
//			        x -> x.getDepartment(),
//			        Collectors.mapping(
//			            e -> e.getSalary(),
//			            Collectors.reducing((a, b) -> a + b)
//			        )
//			    ));
//		
//		System.out.println(result);
		
		
//	 Map<Object, Double> result =employees.stream().collect(Collectors.groupingBy(e->e.getDepartment(),Collectors.summingDouble(e->e.getSalary())));
//	 System.out.println(result);
		
		
//		Map<Object, DoubleSummaryStatistics> result=employees.stream().collect(Collectors.groupingBy(e-> e.getDepartment(),
//				Collectors.summarizingDouble(e->e.getSalary())));
//		
//		System.out.println(result);
		
//		DoubleSummaryStatistics result =employees.stream().collect(Collectors.filtering(e->e.getDepartment().equals("IT"),
//				Collectors.summarizingDouble(e->e.getSalary())));
//		
//		System.out.println(result);
		
		
//		Optional<Employee> result =employees.stream().collect(Collectors.maxBy((e1,e2)->e1.getAge()-e2.getAge()));
//		System.out.println(result);
		
//		Optional<Employee> result =employees.stream().collect(Collectors.maxBy(Comparator.comparing(e->e.getAge())));
//		System.out.println(result);
		
//		String result = employees.stream()
//			    .collect(Collectors.collectingAndThen(
//			        Collectors.maxBy(Comparator.comparing(e -> e.getSalary())),
//			        empOpt -> empOpt.map(e -> e.getFirstName()).orElse("Name Not Found")
//			    ));
//		
//		System.out.println(result);
		
		
		
		
		
	}

}
