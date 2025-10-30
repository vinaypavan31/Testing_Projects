
public class constructorDemo {
	
	public constructorDemo() {
		System.out.println("I am in the constructor");
	}
	
	public void getData() {
		System.out.println("I am the method");
	}

	public static void main(String[] args) {
		
		constructorDemo cd=new constructorDemo();
		cd.getData();
	}

}
