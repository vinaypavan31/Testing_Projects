
public class thisDemo {
	
	
	int a=2;
	
	public  void getData() {
		int a=3;
		System.out.println(this.a);
		System.out.println(a);
	}

	public static void main(String[] args) {
		thisDemo d=new thisDemo();
		d.getData();

	}

}
