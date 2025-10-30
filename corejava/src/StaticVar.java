
public class StaticVar {
	
	String name;//instance variables
	String address;
	static String city;//class variables
	static int i;
	static {
		city="Chennai";
		i=99;
	}
	
	StaticVar(String name,String address ){
		this.name=name;
		this.address=address;//local variables
//		i++;
//		System.out.println(i);
	}
	
	public void getAddress() {
		System.out.println(address+", "+city);
	}
	public static void getCity() {
		System.out.println(city);
	}

	public static void main(String[] args) {
		
		StaticVar obj=new StaticVar("Bob","karapakkam");
		StaticVar obj1=new StaticVar("Ram","thoraipakkam");
		StaticVar obj2=new StaticVar("Ram","thoraipakkam");
		obj.getAddress();
		obj1.getAddress();
		//System.out.println(city);
		StaticVar.getCity();
		//StaticVar.i=8;
		obj2.address="perungudi";
		
		obj2.getAddress();
		System.out.println(i);
		
		
	}
	
	

}
