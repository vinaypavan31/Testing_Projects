package test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("i will execute before class");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("i will execute after class");
	}
	
	@Test
	public void SecondTest() {
		System.out.println("bye from day2");
	}
	
	@Test(groups= {"smoke"})
	public void ThirdTest() {
		System.out.println("this is 3");
	}
	
	@BeforeTest
	public void prerequisite() {
		System.out.println("i will execute first of test folder");
	}
	@AfterTest
	public void endoftest() {
		System.out.println("i will execute last of test folder");
	}
	@BeforeSuite
	public void beforesuite() {
		System.out.println("before the suite");
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("after the suite");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("before every method");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("after every method");
	}
	
}
