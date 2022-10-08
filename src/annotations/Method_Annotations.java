package annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Method_Annotations 
{
	
	//Annotations
	
	@BeforeMethod
	public void before_Method()
	{
		
		
		System.out.println("Before Method Executed!!");
		
	}//before_Method
	
	
	@AfterMethod
	public void afterMethod()
	{
		
		System.out.println("After Method Executed!!");
		System.out.println();
	
	}//afterMethod
	
	
	
	
	
	//Test Cases
	
	@Test
	public void logIn()
	{
		
		System.out.println("Login Test Case Executed");
		
	}//logIn
	

	@Test
	public void home()
	{
		
		System.out.println("Home Test Case Executed");
		
	}//home

	
	@Test
	public void logOut()
	{
		
		System.out.println("Log Out Test Case Executed");
		
	}//logOut

	
	

}//Method_Annotations
