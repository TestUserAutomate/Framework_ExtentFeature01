package com.test.concepts;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.DataLibrary;

public class Login_Guru_DataProviderConcept {
	
	@Test(dataProvider="CustomerFeed")
	public void login(String CustomerName,String Gender,String Dob,String Address,String City,String State,String Pin,String MobileNumber,String Email,String Password) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./Chromedriver_84/chromedriver.exe");

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/V4/");

		driver.findElement(By.name("uid")).sendKeys("mngr275733");
		driver.findElement(By.name("password")).sendKeys("dYzUsYj");

		driver.findElement(By.name("uid")).sendKeys("mngr26593");
		driver.findElement(By.name("password")).sendKeys("ishal!12");

		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'New Customer')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@name='name']")).sendKeys(CustomerName);
		driver.findElement(By.xpath("//*[@name='rad1']")).click();
		driver.findElement(By.xpath("//*[@name='dob']")).sendKeys(Dob);
		driver.findElement(By.xpath("//*[@name='addr']")).sendKeys(Address);
		driver.findElement(By.xpath("//*[@name='city']")).sendKeys(City);
		driver.findElement(By.xpath("//*[@name='state']")).sendKeys(State);
		driver.findElement(By.xpath("//*[@name='pinno']")).sendKeys(Pin);
		driver.findElement(By.xpath("//*[@name='telephoneno']")).sendKeys(MobileNumber);
		driver.findElement(By.xpath("//*[@name='emailid']")).sendKeys(Email);
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys(Password);
		
	}
	
/*	@DataProvider(name="data")
	public Object[][] readExcelData() throws IOException {
		
		Object[][] readExcelData = DataLibrary.readExcelData("excel");
		return readExcelData;
	}*/
	@DataProvider(name="CustomerFeed")
	public Object[][] readCustomerFeed() throws IOException {
		
		Object[][] readExcelData = DataLibrary.readExcelData("CustomerFeed");
		return readExcelData;
	}

}
