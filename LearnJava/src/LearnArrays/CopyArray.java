package LearnArrays;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		
//		String[] cities= {"hyderabad","cochin","chennai","bengaluru","delhi","mumbai"};
//		
//		String[] newCities=new String[cities.length];
//		
//		for(int i=0;i<cities.length;i++) {
//			newCities[i]=cities[i];
//		}
//		
//		System.out.println("elements of cities:");
//		
//		for(int i=0;i<cities.length;i++) {
//			System.out.println(cities[i]+" ");
//		}
//		System.out.println("elements of newCities:");
//		
//		for(int i=0;i<newCities.length;i++) {
//			System.out.println(newCities[i]+" ");
//		}
		
//		String[] cities= {"hyderabad","cochin","chennai","bengaluru","delhi","mumbai"};
//		String[] newCities=new String[cities.length];
//		
//		System.arraycopy(cities, 0, newCities, 0, 6);
//		
//		System.out.println(Arrays.toString(newCities));
		
//		String[] cities= {"hyderabad","cochin","chennai","bengaluru","delhi","mumbai"};
//		String[] newCities=cities.clone();
//		System.out.println(Arrays.toString(newCities));
		
		
		String[] cities= {"hyderabad","cochin","chennai","bengaluru","delhi","mumbai"};
		String[] newCities=Arrays.copyOf(cities, 6);
		System.out.println(Arrays.toString(newCities));
		

	}

}
