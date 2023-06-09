package selenium.seleniumapp;

import org.testng.ISuite;
import org.testng.ISuiteListener;


public class iSuitListener implements ISuiteListener{
  @Override
  public void onStart(ISuite suite) {
	  System.out.println("Starting: "+suite.getName());
	  
  }
  public void onFinish(ISuite suite)
  {
	  System.out.println("Finished : "+suite.getName());
  }
}
