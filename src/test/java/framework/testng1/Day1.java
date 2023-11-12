package framework.testng1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day1 {
	
	@Test
	public void MobileHomeLoan()
	{
		System.out.println("Mobile Home Loan");
	}
	
	@Test
	public void WebHomeLoan()
	{
		System.out.println("Web Home Loan");
	}

	@BeforeSuite
	public void before_suite()
	{
		System.out.println("I am before suite");
	}
	
	@AfterSuite
	public void after_suite()
	{
		System.out.println("I am after suite");
	}
	
	@BeforeTest
	public void before_test()
	{
		System.out.println("I am before test");
	}
	
	@AfterTest
	public void after_test()
	{
		System.out.println("I am after test");
	}
}
