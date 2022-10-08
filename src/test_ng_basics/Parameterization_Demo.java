package test_ng_basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization_Demo
{
	
	@Parameters({"first_name","last_name"})
	@Test
	public void sendData(String first_name,String last_name)
	{
		
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Selenium\\selenium-java-4.1.3\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/signup");
		
		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys(first_name);

		driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys(last_name);
		
		System.out.println(first_name);
		
	
	}
	
	

}
