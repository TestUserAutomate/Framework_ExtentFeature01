package com.test.ExtentReporting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Exreporting {
	static ExtentTest testFrame ;
	static WebDriver driver;
	static ExtentHtmlReporter htmlReporter;

	public static void main(String[] args) {
		 htmlReporter = new ExtentHtmlReporter("./ExtentReport/extent.html");
		  ExtentReports extent = new ExtentReports();
	        extent.attachReporter(htmlReporter);
	      testFrame = extent.createTest("My Googletest", " Google Enter key Validation");
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		testFrame.log(Status.INFO,"logging into the main url");
		driver.get("https://www.google.com/");
		testFrame.pass("navigated to the google");
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Automation ",Keys.ENTER);
		testFrame.pass("Enter the given key values");
		
		driver.close();
		testFrame.pass("successfully closed");
		driver.quit();
		testFrame.info("TestCaseCompleted");
		extent.flush();

	}

}
