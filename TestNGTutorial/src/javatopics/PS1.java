package javatopics;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class PS1 {

	
	
	public void ps1method() {
		System.out.println("this is method from ps1");
	}
	@BeforeMethod
	public void beforTest() {
		System.out.println("before method");
	}
	
	
	@AfterMethod
	public void afterTest() {
		System.out.println("after method");
	}


}
