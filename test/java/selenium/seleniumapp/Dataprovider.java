package selenium.seleniumapp;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
  @DataProvider(name="test-data")
	public Object[][] getdata()
    {
		return new Object[][] {
			{"Muthu",19},{"Kaaviya",18}
		};

	}
   @Test(dataProvider="test-data")
   public void testMethod(String name,int age) {
	   System.out.println("Name: "+name+", Age: "+age);
	   
   }
}
