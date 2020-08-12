package com.qa.dropdown;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.amazon.selenium.base.SeleniumBase;


public class DropDownItems extends SeleniumBase {

	Select dropDown=new Select(driver.findElement(By.id("searchDropdownBox")));
	 
	public DealsPage dropDownDeals() {
			dropDown.selectByVisibleText("Deals");
			log.info("In Home page, Deals text selected");
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shirts");
			driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
			log.info("Deals search clicked");
			return new DealsPage();
		}
	 
	 public AppliancePage dropDownAppliances() {
		 dropDown.selectByVisibleText("Appliances");
		 log.info("In Home page, Appliances text selected");
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("vacuum cleaner");
		 driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
		 log.info("Appliances search clicked");
		 return new AppliancePage();
		 
	 }
	 
	 public ElectronicsPage dropDownElectronics() {
		 dropDown.selectByVisibleText("Electronics");
		 log.info("In Home page, Electronics text selected");
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("vacuum cleaner");
		 driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
		 log.info("Electronics search clicked");
		 return new ElectronicsPage();
		 
	 }
	 
	 public KindlePage dropDownKindleStore() {
         dropDown.selectByVisibleText("Kindle Store");
         log.info("In Home page, Kindle Store text selected");
         driver.findElement(By.id("twotabsearchtextbox")).sendKeys("kindle");
         driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
         log.info("Kindle Store search clicked");
         return new KindlePage();
         
     }
	 public WatchPage dropDownWatches() {
		 dropDown.selectByVisibleText("Watches");
		 log.info("In Home page, Kindle Store text selected");
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Rolex");
		 driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
		 log.info("Watches search clicked");
		 return new WatchPage();
		 	 
	 }

}
