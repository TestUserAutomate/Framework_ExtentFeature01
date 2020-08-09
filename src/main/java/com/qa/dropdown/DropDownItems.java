package com.qa.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.amazon.selenium.base.SeleniumBase;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class DropDownItems extends SeleniumBase {

	
	
	
	Select dropDown=new Select(driver.findElement(By.id("searchDropdownBox")));
	 
	public DealsPage dropDownDeals() {
			dropDown.selectByVisibleText("Deals");
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("shirts");
			driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
			String s=driver.getTitle();
			System.out.println(s);
			return new DealsPage();
		}
	 
	 public AppliancePage dropDownAppliances() {
		 dropDown.selectByIndex(8);
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("vacuum cleaner");
		 driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
		 String s=driver.getTitle();
		 System.out.println(s);
		 return new AppliancePage();
		 
	 }
	 
	 public ElectronicsPage dropDownElectronics() {
		 dropDown.selectByVisibleText("Electronics");
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("vacuum cleaner");
		 driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
		 String s=driver.getTitle();
		 System.out.println(s);
		 return new ElectronicsPage();
		 
	 }
	 
	 public kindlePage dropDownKindleStore() {
         dropDown.selectByVisibleText("Kindle Store");
       /*  test.log(Status.INFO,"Inside Kindle");*/
         driver.findElement(By.id("twotabsearchtextbox")).sendKeys("kindle");
         driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
        /* test.log(Status.INFO,"Entered Kindle");*/

         String s=driver.getTitle();
         System.out.println(s);
         return new kindlePage();
         
     }
	 public WatchPage dropDownWatches() {
		 dropDown.selectByVisibleText("Watches");
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Rolex");
		 driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
		 String s=driver.getTitle();
		 System.out.println(s);
		 return new WatchPage();
		 	 
	 }

}
