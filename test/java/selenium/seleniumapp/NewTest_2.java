package selenium.seleniumapp;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest_2 { 
	  WebDriver driver;
		@Test(priority=4)
		public void add()
		{
			int a=10,b=2,c=0;
			c=a+b;
			System.out.println("Addition : "+c);
			Assert.assertEquals(12,c);
		}
		@Test(priority=2)
		public void sub()
		{
			int a=17,b=2,c=0;
			c=(a-b);
			System.out.println("Subtraction : "+c);
			Assert.assertEquals(15,c);
		}
		@Test(priority=1)
		public void mul()
		{
			int a=10,b=2,c=0;
			c=(a*b);
			System.out.println("Multiplication : "+c);
			Assert.assertEquals(20,c);
		}
		@Test(priority=3)
		public void div()
		{
			int a=10,b=2,c=0;
			c=(a/b);
			System.out.println("Division : "+c);
			Assert.assertEquals(5,c);
		}
  }

