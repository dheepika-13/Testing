package selenium.seleniumapp;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NewTest {
  WebDriver driver;
	@Test
	public void checkTitle()
	{
		String expectedTitle="Google";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle,expectedTitle);
	}
@BeforeMethod
public void beforeMethod()
{
	  WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	  driver.get("https://www.google.com/");
}
@AfterMethod
public void afterMethod()
{
	 driver.close(); 
}
}
