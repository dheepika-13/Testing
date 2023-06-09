package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.example.testing.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	public static void main(String args[])
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		//driver.findElement(null);
		LoginPage.Gender(driver).click();
	}

}
