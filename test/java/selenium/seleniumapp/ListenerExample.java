package selenium.seleniumapp;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class ListenerExample implements ITestListener {
  @Test
  public void onTestStart(ITestResult result) {
	  System.out.println("Test is going to start");
	  
  }
  public void OnTestSuccess(ITestResult result)
  {
	  System.out.println("TestCase is passed ");
  }

  public void OnTestFailure(ITestResult result)
  {
	  System.out.println("TestCase is Failure");
  }

  public void onTestSkipped(ITestResult result)
  {
	  System.out.println("Testcase Skipped");
  }
  public void OnTestFailedButWithSuccessPercentage(ITestResult result)
  {
	  System.out.println("Testcase failed with success percentage");
  }
  public void onStart(ITestResult result)
  {
	  System.out.println("Before Everything");
  }
  public void onFinish(ITestResult result)
  {
	  System.out.println("After Everything");
  }
  

}
