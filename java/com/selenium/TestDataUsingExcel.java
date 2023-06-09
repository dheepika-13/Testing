package com.selenium;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import day_10.ExcelUtility;


@Test(dataProvider="testdata")
public class TestDataUsingExcel {
  public void addMethod(double num1,double n2) {
	  double result=num1+n2;
	  
  }
  @DataProvider
  public Object[][] testdata() throws IOException{
	  Object [][] data=ExcelUtility.readExcel();
	 ExcelUtility.updateExcel();
	  return data;
  }
}
