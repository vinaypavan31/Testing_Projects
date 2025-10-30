package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	@Parameters({"URL","name"})
	@Test
	public void WebLoginHomeLoan(String urlName,String name) {
		//selenium
		
		System.out.println("WebLoginHomeLoan");
		System.out.println(urlName +" this is url passed as parameter");
		System.out.println(name+"&&&&&&&&&&&&&&&&&&&&&");
	}
	@Test(dependsOnMethods= {"WebLoginHomeLoan"})
	public void MobileLoginHomeLoan() {
		//appium
		System.out.println("MobileLoginHomeLoan");
	}
	@Parameters({"URL"})
	@Test(groups= {"smoke"})
	public void LoginAPIHomeLoan(String etoe) {
		//rest API automation
		System.out.println("LoginAPIHomeLoan");
		System.out.println(etoe);
	}
	
	@Test(enabled= false)
	public void SignInAPIHomeLoan() {
		//rest API automation
		System.out.println("SignInAPIHomeLoan");
	}
	
	
	@Test(timeOut=4000)
	public void TimeoutHomeLoan() {
		//rest API automation
		System.out.println("timeout");
	}
	
	
	
	

}
