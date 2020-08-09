package com.qa.tooltip.mobiles_computers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.amazon.selenium.base.SeleniumBase;
import com.aventstack.extentreports.Status;

public class MobilesAndComputersPage extends SeleniumBase {
	
	public LaptopsPage clickLaptops() {
		WebElement ele1 = driver.findElement(By.xpath("//*[contains(text(),'Laptops')]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele1);
		test.log(Status.INFO,"Laptops Successfully clicked  and it moving to the page designated for laptops");
		return new LaptopsPage();
	}

	public MobilesPage clickMobiles() {
		WebElement ele1 = driver.findElement(By.xpath("//*[contains(text(),'Mobile Phone')]"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele1);
		test.log(Status.INFO,"Laptops Successfully clicked  and it moving to the page designated for Mobiles");
		return new MobilesPage();
	}

}
  