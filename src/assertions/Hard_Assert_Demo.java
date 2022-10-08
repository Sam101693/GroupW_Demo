package assertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assert_Demo
{
	
	
	@Test
	public void validateTitle() throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Selenium\\selenium-java-4.1.3\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/signup");
		
		String actual_page_title = driver.getTitle();
		
		Boolean is_present = actual_page_title.contains("Facebookkkkk");
		
		Assert.assertFalse(is_present, "Test Case Failed!!");
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}//validateTitle
	
	
	

}
