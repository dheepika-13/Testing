package com.selenium;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class listnerDay09_5 implements ITestListener{
  @Test
  public void f() {
  }

@Override
public void onTestStart(ITestResult result) {
	System.out.println("Test started:"+result.getName());
	
}

@Override
public void onTestSuccess(ITestResult result) {
	System.out.println("Test success:"+result.getName());
	
}

@Override
public void onTestFailure(ITestResult result) {
	System.out.println("Test failure:"+result.getName());
	
}

@Override
public void onTestSkipped(ITestResult result) {
	System.out.println("Test skipped:"+result.getName());
	
}

@Override
public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	// TODO Auto-generated method stub
	
}

@Override
public void onStart(ITestContext context) {
	// TODO Auto-generated method stub
	
}

@Override
public void onFinish(ITestContext context) {
	// TODO Auto-generated method stub
	
}
}
