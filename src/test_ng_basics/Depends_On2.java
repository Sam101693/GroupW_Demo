package test_ng_basics;

import org.testng.annotations.Test;

public class Depends_On2 
{
	
	
	@Test(dependsOnMethods = "test_ng_basics.Depends_On.login")
	public void dashBoard()
	{
		
		System.out.println("DashBoard Test Case from Depends_On2 Executed!!");
		
	}
	
	
	@Test
	public void buyShare()
	{
		
		System.out.println("Buy Share Test Case from Depends_On2 Executed!!");
		
	}


	@Test
	public void sellShare()
	{
		
		System.out.println("Sell Share Test Case from Depends_On2 Executed!!");
		
	}



}
