package multiple_classes_demo;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.Test;

public class Single_Class_2 
{
	
	
	
	@AfterGroups("Regression")
	public void afterGroups()
	{
		
		System.out.println("AfterGroups Annotation Executed!!");
		
	}
	
	
	@Test(priority = 5,groups = "Regression")
	public void logIn2()
	{
		
		System.out.println("Login In 2 from Single_Class_2(Regression) Executed");
		
	}//logIn2
	

	@Test(priority = 99)
	public void dashBoard2()
	{
		
		System.out.println("DashBoard 2 from Single_Class_2(Smoke) Executed");
		
	}//dashBoard2

	
	
	@Test(priority = 6,groups = {"Smoke","Sanity"})
	public void logOut2()
	{
		
		System.out.println("Login Out 2 from Single_Class_2(Sanity/Smoke) Executed");
		
	}//logOut2


}
