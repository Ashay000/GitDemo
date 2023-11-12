package framework.testng1;

import org.testng.annotations.Test;

public class Day2 {

	
	@Test(groups={"car"})
	public void MobileCarLoan()
	{
		System.out.println("Mobile Car Loan");
	}
	
	@Test(groups={"car"})
	public void WebCarLoan()
	{
		System.out.println("Web Car Loan");
	}
}
