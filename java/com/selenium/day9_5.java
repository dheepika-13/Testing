package com.selenium;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class day9_5 {
  @Test
  public void test01() {
	  Assert.assertEquals(false, false);
  }
  
  @Test
  public void test02() {
	  Assert.assertEquals(true, true);
  }
}
