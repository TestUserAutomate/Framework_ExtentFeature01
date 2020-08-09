package com.testingExtent;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class TestFile extends ExtentDemo{
	ExtentTest test;
	ExtentTest test1;
	
	@Test
	public void loginByEmail() {
		 test = extent.createTest("LogintoEmil");
		System.out.println("Login by Email");
		test.log(Status.INFO, "logeed in");
		test.log(Status.PASS, "Testcase is passed");
		
	}
	@Test
	public void loginByFacebook() {
		 test1 = extent.createTest("LogintoEmil");
		System.out.println("Login by Facebook");
		Assert.assertEquals("Nithin","Nithin");
		test1.log(Status.INFO, "logeed in to facebook");
		test1.log(Status.FAIL, "Testcase Failed");
	}
	
	@AfterTest
	public void teardown() {
		extent.flush();
	}

}
