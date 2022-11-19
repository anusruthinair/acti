package com.section3;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoTestNG {
	@Test
	public void checkAssert()
	{
		String actual="hello";
		String expected="Hello";
		SoftAssert as=new SoftAssert();
		as.assertEquals(actual,expected);
		System.out.println("assertion completed");
		as.assertAll();
	
	}
}
//assertion completed
//FAILED: checkAssert










