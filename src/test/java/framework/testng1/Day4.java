package framework.testng1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day4 {
	
	@Test
	public void MobileEducationLoan()
	{
		System.out.println("Mobile Education Loan");
	}
	
	@Test
	public void WebEducationLoan()
	{
		System.out.println("Web Education Loan");
	}

	@BeforeClass
	public void before_class()
	{
		System.out.println("I am before class");
	}
	
	@AfterClass
	public void after_class()
	{
		System.out.println("I am after class");
	}
	
	@BeforeMethod
	public void before_method()
	{
		System.out.println("I am before method");
	}
	
	@AfterMethod
	public void after_method()
	{
		System.out.println("I am after method");
	}
}
