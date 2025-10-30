package inheritance;

public class ChildClassDemo extends ParentClassDemo {

	public static void main(String[] args) {
		
		ChildClassDemo cd=new ChildClassDemo();
		cd.engine();
		cd.color();
		cd.Brakes();
		
	}
	public void engine() {
		System.out.println("new engine");
	}
	public void color() {
		System.out.println(color);
	}

}
