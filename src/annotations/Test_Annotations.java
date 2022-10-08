package annotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_Annotations 
{
	
	
	//Annotations
	
	@BeforeTest
	public void beforeTest()
	{
		
		System.out.println("Before Test Executed!!!!");
		
	}//beforeTest

	
	@AfterTest 
	public void afterTest()
	{
		
		System.out.println("After Test Executed!!!!");
		
	}//afterTest
	
	
	
	
}
