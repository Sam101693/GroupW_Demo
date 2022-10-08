package annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Class_Annotations 
{
	
	//Annotations 
	
	@BeforeClass
	public void beforeClass()
	{
		
		
		System.out.println("Before Class Method Executed!!!!!");
		
	}//beforeClass
	
	
	@AfterClass
	public void afterClass()
	{
		
		System.out.println("After Class Method Executed!!!!!");
		
	}//afterClass
	
	
	
	//Test Cases
	
	@Test
	public void home()
	{
		
		System.out.println("Home Test Case Executed");
		
	}//home
	
	@Test
	public void dashBoard()
	{
		
		System.out.println("DashBoard Test Case Executed");
		
	}//dashBoard

	
	@Test
	public void logOut()
	{
		
		System.out.println("LogOut Test Case Executed");
		
	}//logOut

	
}//Class_Annotations
