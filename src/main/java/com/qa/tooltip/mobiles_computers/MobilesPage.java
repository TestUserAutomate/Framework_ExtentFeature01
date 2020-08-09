package com.qa.tooltip.mobiles_computers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.amazon.selenium.base.SeleniumBase;


public class MobilesPage extends SeleniumBase {

	public  LGMobile enterLGMobile() {
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("LG Mobiles",Keys.ENTER);
		return new LGMobile();
	}
	
	
	public  OppoMobile enterOppoMobile() {
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("Oppo Mobiles",Keys.ENTER);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new OppoMobile();
	}
	public  RealmeMobile enterRealmeMobile() {
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("Realme Mobiles",Keys.ENTER);
		return new RealmeMobile();
	}

}
