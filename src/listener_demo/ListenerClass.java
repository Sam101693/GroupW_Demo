package listener_demo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) 
	{
		
		
		System.out.println("onTestStart Executed!!!! : "+result.getName());
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{

	System.out.println("onTestSuccess Executed!!! : "+result.getName());
	
	
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		
		
		System.out.println("onTestFailure Executed!!!! : "+result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result)
	{
	
		
		System.out.println("onTestSkipped Executed!!!! : "+result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
	
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) 
	{
	
	}

	@Override
	public void onStart(ITestContext context) 
	{
		
		System.out.println("onStart Executed!!! : "+context.getName());
		
	}

	@Override
	public void onFinish(ITestContext context) {
	
		System.out.println("onFinish Executed!!! : "+context.getName());
		
		
	}

}
