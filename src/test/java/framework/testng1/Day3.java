package framework.testng1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
	
	@Test
	public void MobilePersonalLoan()
	{
		System.out.println("Mobile Personal Loan");
	}
	
	@Test
	public void WebPersonalLoan()
	{
		System.out.println("Web Personal Loan");
	}
	
	@Test(timeOut=4000)
	public void a_method()
	{
		System.out.println("A method");
	}
	
	@Test(enabled=false)
	public void b_method()
	{
		System.out.println("B method");
	}
	
	@Test
	public void carrot()
	{
		System.out.println("Carrot");
	}
	
	@Test
	public void beetroot()
	{
		System.out.println("Beetroot");
	}
	
	@Test(dependsOnMethods= {"carrot","beetroot"})
	public void apple()
	{
		System.out.println("Apple");
	}
	
	@Parameters({"qaurl"})
	@Test()
	public void drumstick(String url)
	{
		System.out.println("Drumstick");
		System.out.println(url);
	}

}
