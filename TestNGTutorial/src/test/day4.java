package test;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
public class day4 {
	
	@Test(groups= {"smoke"})
	public void WebLoginCarLoan() {
		//selenium
		
		System.out.println("WebLoginCarLoan");
	}
	@Parameters({"URL"})
	@Test
	public void MobileLoginCarLoan(String name) {
		//appium
		System.out.println("MobileLoginCarLoan");
		System.out.println(name +"*****************");
	}
	
	@Parameters({"URL2"})
	@Test
	public void MobileSigninCarLoan(String name) {
		//appium
		System.out.println("MobileLoginCarLoan");
		System.out.println(name);
	}
	@Test
	public void MobileSignoutCarLoan() {
		//appium
		System.out.println("MobileLoginCarLoan");
	}
	
	@Test(dataProvider="getData")
	public void LoginAPICarLoan(String userName,String password) {
		//rest API automation
		System.out.println("LoginAPICarLoan");
		System.out.println(userName);
		System.out.println(password);
	}
	
	@DataProvider
	public Object[][] getData() {
		//1st - combination -username,password-good credit history
		//2nd username password -no credit history
		//3rd -fraudelent credit history
		
		Object[][] data=new Object[3][2];
		//1st set
		data[0][0]="firstuserName";
		data[0][1]="firstpass";
		//2nd set
		data[1][0]="seconduserName";
		data[1][1]="secondpass";
		//3rd set
		data[2][0]="thirduserName";
		data[2][1]="thirdpass";
		
		return data;
		
	}

}
