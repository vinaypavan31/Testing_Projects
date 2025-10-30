
public class childDemo extends parentDemo {
	
	//String name="Rohit";
	public void getStringData() {
		
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public void getData() {
		super.getData();
		System.out.println("I am child class");
	}
	
	public childDemo() {
		
		System.out.println("child class constructor");
		//super();
	}

	public static void main(String[] args) {
		
		childDemo cd=new childDemo();
		cd.getStringData();
		cd.getData();

	}

}
