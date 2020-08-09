package com.qa.tooltip.Tv_Appliances;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.amazon.selenium.base.SeleniumBase;
import com.qa.tooltip.mobiles_computers.AppleLaptop;

public class Television extends SeleniumBase{
	
	public SamsungPage enterSamsungTelevision(){
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("Samsung",Keys.ENTER);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new SamsungPage();
	}

	public OnePlusPage enterOnePlusTelevision(){
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("One plus Television",Keys.ENTER);
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new OnePlusPage();
	}
	
}
