package listener_demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Listener_Demo 
{
	
	@Test(priority = 1)
	public void login()
	{
		
		
		System.out.println("Login Test Case Executed!!");
		
	}//login
	
	@Test(priority = 2)
	public void dashBoard()
	{
		
		System.out.println("DashBoard Test Case Executed!!");
		
		
	}//dashBoard
	
	
	
	@Test(priority = 3)
	public void sellShare()
	{
		
		System.out.println("SellShare Test Case Executed!!");
		
	}
	
	
	
	@Test(priority = 4)
	public void buyShare()
	{
		
		System.out.println("BuyShare Test Case Executed!!");
		
		Assert.assertTrue(false);
		
	}
	
	
	
	@Test(dependsOnMethods = "buyShare",priority = 5)
	public void logout()
	{
		
		System.out.println("LogOut Test Case Executed!!!");
		
	}

}
