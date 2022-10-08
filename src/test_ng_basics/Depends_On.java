package test_ng_basics;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Depends_On 
{
	
	
	@Test(priority = 1)
	public void login()
	{
		
//		System.out.println("Login Test Case from Depends_On Executed!! ");
		
		Assert.fail("Test Case Failed Deliberately");
		
		System.out.println("Login Test Case from Depends_On Executed!! ");
		
	}
	
	
	@Test(priority = 2, dependsOnMethods = "login")
	public void home()
	{
		
		System.out.println("Home Test Case from Depends_On Executed!!");
		
	}
	
	
	@Test(priority = 3,dependsOnMethods = {"login","home"})
	public void logout()
	{
		
		System.out.println("Logout Test Case from Depends_On Executed!!");
		
	}
	

	
	
	

}
