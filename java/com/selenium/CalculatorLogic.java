package com.selenium;

import org.testng.annotations.Test;

public class CalculatorLogic {
  @Test
  public static int add(int a,int b) {
	  return (a+b);
  }
  @Test
  public static int sub(int c,int d) {
	  return (c-d);
  }
  
  @Test
  public static int mul(int e,int f) {
	  return (e*f);
  }

  @Test
  public static int div(int g,int h) {
	  return (g/h);
  }


}

