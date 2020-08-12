package com.testCases;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;
import com.qa.ApplicationSpecifics.ProjectSpecificMethods;
import com.qa.homepage.AmazonHomePage;

public class dropDownTest extends ProjectSpecificMethods {
	
	@Test
	public void dropDownDealsTest() {
		test = extent.createTest("dropDownDealsTest");
		test.log(Status.INFO, "dropDownDealsTest started");
		new AmazonHomePage().dropDownClick().dropDownDeals().onDealsPage();
	}

	@Test
	public void dropDownApplianceTest() {
		test=extent.createTest("dropDownApplianceTest");
		test.log(Status.INFO, "dropDownApplianceTest started");
		new AmazonHomePage().dropDownClick().dropDownAppliances().onAppliancePage();
	}
	
	@Test
	public void dropDownElectronicsTest() {
		test=extent.createTest("dropDownElectronicsTest");
		test.log(Status.INFO, "dropDownElectronicsTest started");
		new AmazonHomePage().dropDownClick().dropDownElectronics().onElectronicsPage();
	}
	
	@Test
	public void dropDownkindleStoreTest() {
		test=extent.createTest("dropDownkindleStoreTest");
		test.log(Status.INFO, "dropDownkindleStoreTest started");
		new AmazonHomePage().dropDownClick().dropDownKindleStore().onkindlePage();
		
	}
	
	@Test
	public void dropDownWatchesTest() {
		test=extent.createTest("dropDownWatchesTest");
		test.log(Status.INFO, "dropDownWatchesTest started");
		new AmazonHomePage().dropDownClick().dropDownWatches().onWatchPage();
	}

}
