package test_ng_basics;

import org.testng.annotations.Test;

public class Enabled_Keyword
{
	
	@Test
	public void home()
	{
		
		System.out.println("Home Test Case Executed!!");
		
	}
	
	
	@Test
	public void logout()
	{
		
		System.out.println("Logout Case Executed!!");
		
	}
	
	
	
	
	@Test(enabled = false)
	public void DashBoard()
	{
		
		System.out.println("DashBoard Test Case Executed!!");
		
	}
	
	
	
	
	

}
