package test_ng_basics;

import org.testng.annotations.Test;

public class Priority_Keyword
{
	
	@Test(priority = -1)
	public void home()
	{
		
		System.out.println("Home Test Case Executed!!");
		
	}

	@Test(priority = -2)
	public void dashBoard()
	{
		
		System.out.println("DashBoard Test Case Executed!!");
		
	}

	@Test(priority = -4)
	public void logout()
	{
		
		System.out.println("Logout Test Case Executed!!");
		
	}
	
	
	@Test(priority = -3)
	public void buyShare()
	{
		
		System.out.println("BuyShare Test Case Executed!!");
		
	}

	
	@Test
	public void login()
	{
		
		System.out.println("Login Test Case Executed!!");
		
	}

	
	
}
