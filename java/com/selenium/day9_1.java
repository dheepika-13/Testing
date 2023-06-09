package com.selenium;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class day9_1 {
	CalculatorLogic c1=new CalculatorLogic();
		
	
  @Test(dataProvider = "testData")
  public void addMethod(int a,int b,int expected) {
	  int result=c1.add(a,b);
	  Assert.assertEquals(expected, result);
  }
  @DataProvider
  public Object[][] testData(){
	  return new Object[][] {
		  {1,2,3},{2,2,4}
	  } ;
  }
	  @Test(dataProvider = "subData")
	  public void subMethod(int c,int d,int expected) {
		  int output=c1.sub(c,d);
		  Assert.assertEquals(expected, output);
	  }
	  @DataProvider
	  public Object[][] subData(){
		  return new Object[][] {
			  {5,2,3},{7,2,4}
		  } ;
	  
	  
  }
	  
	  @Test(dataProvider = "mulData")
	  public void mulMethod(int e,int f,int expected) {
		  int mulop=c1.mul(e,f);
		  Assert.assertEquals(expected, mulop);
	  }
	  @DataProvider
	  public Object[][] mulData(){
		  return new Object[][] {
			  {5,2,10},{7,2,14}
		  } ;
	  }
	  
		  @Test(dataProvider = "divData")
		  public void divMethod(int g,int h,int expected) {
			  int divop=c1.div(g,h);
			  Assert.assertEquals(expected, divop);
		  }
		  @DataProvider
		  public Object[][] divData(){
			  return new Object[][] {
				  {10,2,5},{98,2,48}
			  } ;
	  
  }
}
