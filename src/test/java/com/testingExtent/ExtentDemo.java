package com.testingExtent;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;



import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.ExtentTest;

import com.aventstack.extentreports.Status;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class ExtentDemo {



	static WebDriver driver=null;
	static ExtentReports extent;
	static ExtentHtmlReporter htmlReporter;


	public ExtentDemo() {

		htmlReporter= new ExtentHtmlReporter(".\\reports\\myextent.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);



		/*// creating tests

		ExtentTest test1 = extent.createTest("Google Search Test one","This is to validate google search func");

		System.setProperty("webdriver.chrome.driver", ".\\Chromedriver_84\\chromedriver.exe");

		driver=new ChromeDriver();

		test1.log(Status.INFO, "starting test case");



		driver.get("https://www.google.co.in/");

		test1.pass("Navigate to google page");
*/
/*

		driver.findElement(By.name("q")).sendKeys("abcd");

		test1.pass("entered text");*/

		//driver.findElement(By.name("btnk")).click();

/*		//test1.pass("clicked on element");



		driver.close();

		test1.pass("closed the browser");



		test1.info("Test Completed");



		//mandatory in extent reports for writing the log file

		extent.flush();*/

	}



}

