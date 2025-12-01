package MultiThreading;

public class TestMultiThreading {

	public static void main(String[] args) throws InterruptedException {
		//Thread t1 = new Thread();
		Employee e1 = new Employee("T1");
		
		e1.start();
		//Thread.sleep(2000);
		Manager m1 = new Manager("T2");
		m1.start();
		System.out.println(e1.activeCount());
		

	}

}
class Employee extends Thread {
	
	public Employee(String tName) {
		super(tName);
	}
	
	@Override
	public void run() {
		System.out.println("hello -"+Thread.currentThread().getName()+"  -----"+Thread.currentThread().getId());
		
	}
}
class Manager extends Thread {
	public Manager(String tName) {
		super(tName);
	}
	
	@Override
	public void run() {
		System.out.println("hi -"+Thread.currentThread().getName()+"  -----"+Thread.currentThread().getId());
		
	}
}
