package test_ng_basics;

import org.testng.annotations.Test;

public class Invocation_Count
{
	
	@Test(invocationCount = 5,priority = 34)
	public void home()
	{
		
		System.out.println("Home Test Case Executed");
		
	}//home
	
	@Test
	public void dashBoard()
	{
		
		System.out.println("DashBoard Test Case Executed");
		
	}//dashBoard
	
	
	@Test(invocationCount = 3)
	public static void logout()
	{
		
		System.out.println("Logout Test Case Executed");
		
	}//logout
	
	
}//Invocation_Count
