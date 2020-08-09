package com.qa.tooltip.Tv_Appliances;

import org.openqa.selenium.By;

import com.amazon.selenium.base.SeleniumBase;
import com.aventstack.extentreports.Status;
import com.qa.tooltip.mobiles_computers.MobilesAndComputersPage;

public class ToolTipPage extends SeleniumBase {
	

	public MobilesAndComputersPage clickMobilesAndComputers() {
		/*click(locateElement("xpath", "//*[contains(text(),'Mobiles, C')]"));*/
		driver.findElement(By.xpath("//*[contains(text(),'Mobiles, C')]")).click();
		test.log(Status.INFO,"Mobiles and computers has been clicked successfully");
		return new MobilesAndComputersPage();
		
	}
	public TV_AppliancesPage clickTv_Appliances_Electronics() {
		click(locateElement("xpath","//div[contains(text(),'TV, Appliances')]"));
		test.log(Status.INFO,"Tv Appliances and Electronics  has been clicked successfully");
		return new TV_AppliancesPage();
		
	}

	
	
	


}
