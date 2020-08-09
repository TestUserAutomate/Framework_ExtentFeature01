package com.test.ExtentReporting;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportingDemowithTestNG {
	public WebDriver driver;
	public static ExtentHtmlReporter reporter;
	public static ExtentReports extent;
	public static ExtentTest testFrame, node;
	@BeforeSuite
	public void startReport(){
		reporter = new ExtentHtmlReporter("./ExtentReport/result.html");
		 extent = new ExtentReports();
		extent.attachReporter(reporter);
		testFrame = extent.createTest("My Googletest", " Google Enter key Validation");

		
	}
	@Test
	public void demotest() throws IOException{
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
    driver = new ChromeDriver();
	driver.manage().window().maximize(); 
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
	testFrame.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
    
    // test with snapshot
 /*   testFrame.addScreenCaptureFromPath("screenshot.png");*/
	testFrame.log(Status.INFO,"logging into the main url");
	driver.get("https://www.google.com/");
	testFrame.pass("navigated to the google");
	
	testFrame.addScreenCaptureFromPath("./ExtentReport/result.png");
	driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Automation ",Keys.ENTER);
	testFrame.addScreenCaptureFromPath("./Screenshot/testScreensho111t.png");
	testFrame.pass("Enter the given key values");
	driver.close();
	testFrame.pass("successfully closed");
	driver.quit();
	testFrame.info("TestCaseCompleted");
		
/*		

        // info(details)
        test.info("This step shows usage of info(details)");
        
        // log with snapshot
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
        
        // test with snapshot
        testFrame.addScreenCaptureFromPath("./ExtentReport/screenshot.png");
        */
       
	}
	
	@AfterSuite
public void teardown(){
		
		 
        extent.flush();
        driver.close();
		
	}

}
