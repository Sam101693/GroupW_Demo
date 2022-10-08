package test_ng_basics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Reporter_Class
{
	
	@Test
	public void logIn()
	{
		
		
		System.out.println("logIn test case executed!!");
		
		Reporter.log("Login Test Case Passed!!!(No Boolean Condition)");
		
	}//logIn

	@Test
	public void home()
	{
		
		System.out.println("Home test case executed!!");
		
		Reporter.log("Home Test Case Passed(True)!!!!!", true);
		
	}//home
	
	@Test
	public void dashBoard()
	{
		
		System.out.println("dashBoard Test Case Executed");
		
		Reporter.log("DashBoard Test Case Passed(False)", false);
		
	}//
	
	
}//Reporter_Class
