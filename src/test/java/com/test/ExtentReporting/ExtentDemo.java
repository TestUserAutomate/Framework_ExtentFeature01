package com.test.ExtentReporting;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentDemo extends TakeScreenShot{
	public WebDriver driver;
	public static ExtentHtmlReporter reporter;
	public static ExtentReports extent;
	public static ExtentTest testFrame, node;
@BeforeSuite
public static void startTest()
{
	reporter = new ExtentHtmlReporter("./ExtentReport/result.html");
	 extent = new ExtentReports();
	extent.attachReporter(reporter);
	testFrame = extent.createTest("My Googletest", " Google Enter key Validation");
}
@Test
public void extentReportsDemo() throws IOException
{
	System.setProperty("webdriver.chrome.driver","./Chromedriver_84/chromedriver.exe");
    driver = new ChromeDriver();
	driver.manage().window().maximize(); 
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
	driver.get("https://www.google.com/");
if(driver.getTitle().equals("Google"))
{
	testFrame.log(Status.PASS,testFrame.addScreenCaptureFromPath(capture(driver))+ "Test passed");
	testFrame.log(Status.INFO,"naivgated");
	testFrame.log(Status.PASS,"Navigated to the specific URL");
	testFrame.pass("TestCase Passed");

}
else
{
	
	testFrame.log(Status.FAIL,testFrame.addScreenCaptureFromPath(capture(driver))+ "Test Failed");
	testFrame.log(Status.INFO,"naivgated");
	testFrame.log(Status.FAIL,"Havent navigated to the relevant URL");
	testFrame.fail("TestCase Failed");
}
}
@Test
public void extentReportsDemo_TC002() throws IOException
{
	System.setProperty("webdriver.chrome.driver","./Chromedriver_84/chromedriver.exe");
    driver = new ChromeDriver();
	driver.manage().window().maximize(); 
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
	driver.get("https://www.google.com/");
if(driver.getTitle().equals("Googlesddgfg"))
{
	testFrame.log(Status.FAIL,testFrame.addScreenCaptureFromPath(capture(driver))+ "Test Failed");
	testFrame.log(Status.INFO,"naivgated");
	testFrame.log(Status.PASS,"Navigated to the specific URL");
     testFrame.pass("TestCase Passed");
}
else
{
	testFrame.log(Status.FAIL,testFrame.addScreenCaptureFromPath(capture(driver))+ "Test Failed");
	testFrame.log(Status.INFO," Failed navigation");
	testFrame.log(Status.FAIL,"Havent navigated to the relevant URL");
	testFrame.fail("TestCase Failed");
}
}
@AfterMethod
public void afterMethod01(){
	driver.close();
}
@AfterClass
public static void endTest()
{

extent.flush();

}
}