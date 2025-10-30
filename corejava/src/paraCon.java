
public class paraCon {
	
	public void getData() {
		System.out.println("this is separate method");
	}
	
	public paraCon() {
		System.out.println("i am in explicit constructor");
	}
	
	public paraCon(String name) {
		System.out.println("Hi "+name+", i am from parameterized constructor");
	}

	public static void main(String[] args) {
		
		paraCon pc=new paraCon("Vinay");

	}

}
