package javatopics;

import org.testng.annotations.Test;

public class PS extends PS1 {

	
	@Test
	public void psmethod() {
		
		PS2 ps2=new PS2(3);//parameterized constructor
		int a=3;
		ps1method();
		
		System.out.println(ps2.increment());
		System.out.println(ps2.decrement());
		
		//PS3 ps3= new PS3(3);
		
		System.out.println(ps2.multiplyTwo());
		System.out.println(ps2.multiplyThree());
		
	}

}
