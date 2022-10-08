package multiple_classes_demo;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Single_Class_1
{
	
	
	@BeforeGroups("Regression")
	public void beforeGroup()
	{
		
		System.out.println("BeforeGroups Annotation Executed!!!");
		
	}
	
	
	
	@Test(groups = {"Smoke","Regression"})
	public void logIn1()
	{
		
		System.out.println("Login In 1 from Single_Class_1(Smoke/Regression) Executed");
		
	}//logIn1
	

	@Test(priority = 1,groups = "Regression")
	public void dashBoard1()
	{
		
		System.out.println("DashBoard 1 from Single_Class_1(Regression) Executed");
		
	}//dashBoard1

	
	
	@Test(priority = -1)
	public void logOut1()
	{
		
		System.out.println("Login Out 1 from Single_Class_1(Sanity) Executed");
		
	}//logOut1

	
	
	
	
	
}
