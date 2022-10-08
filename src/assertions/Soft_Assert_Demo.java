package assertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert_Demo
{
	
	@Test
	public void validateUrl()
	{
		
		
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Selenium\\selenium-java-4.1.3\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/signup");
		
		String url = driver.getCurrentUrl();
		
		Boolean is_present = url.contains("Facebook");
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertFalse(is_present,"Test Case Failed!!!Please File a Bug");
		
		driver.quit();
		
		sa.assertAll();
			
	}
	
	
	

}
