package com.qa.tooltip.mobiles_computers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.amazon.selenium.base.SeleniumBase;


public class LaptopsPage extends SeleniumBase {
	
	public  AppleLaptop EnterAppleLaptop() {
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("apple laptops",Keys.ENTER);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new AppleLaptop();
	}
	public  AsusLaptop EnterAsusLaptop() {
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("Asus laptops",Keys.ENTER);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new AsusLaptop();
	}
	public  AcerLaptop EnterAcerLaptop() {
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("Acer laptops",Keys.ENTER);
		return new AcerLaptop();
	}

	

}
