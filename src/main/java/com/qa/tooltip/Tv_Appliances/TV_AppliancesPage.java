package com.qa.tooltip.Tv_Appliances;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.amazon.selenium.base.SeleniumBase;
import com.aventstack.extentreports.Status;
import com.qa.tooltip.mobiles_computers.MobilesPage;

public class TV_AppliancesPage extends SeleniumBase{
	
	public Television clicktelevision() {
	WebElement ele1 = driver.findElement(By.xpath("//*[contains(text(),'Television')]"));
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", ele1);
	test.log(Status.INFO,"Laptops Successfully clicked  and it moving to the page designated for Mobiles");
	return new Television();

}

	
}