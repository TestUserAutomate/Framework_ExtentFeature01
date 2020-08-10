package com.testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.qa.ApplicationSpecifics.ProjectSpecificMethods;
import com.qa.homepage.AmazonHomePage;

public class dropDownTest extends ProjectSpecificMethods {
	
	
	@Test
	public void dropDownDealsTest() {
	
		
		test=extent.createTest("dropDownDealsTest");
		new AmazonHomePage()
		.dropDownClick().dropDownDeals();
	}
	
	/*@Test
	public void dropDownApplianceTest() {
		test=extent.createTest("dropDownApplianceTest");
		new AmazonHomePage().dropDownClick().dropDownAppliances();
	}
	
	@Test
	public void dropDownElectronicsTest() {
		test=extent.createTest("dropDownElectronicsTest");
		new AmazonHomePage().dropDownClick().dropDownElectronics();
	}
	
	@Test
	public void dropDownkindleStoreTest() {
		test=extent.createTest("dropDownkindleStoreTest");
		test.log(Status.INFO, "Test started");
		new AmazonHomePage().dropDownClick().dropDownKindleStore();
		
	}
	
@Test
	public void dropDownWatchesTest() {
		test=extent.createTest("dropDownWatchesTest");
		new AmazonHomePage().dropDownClick().dropDownWatches();
	}
*/
}
