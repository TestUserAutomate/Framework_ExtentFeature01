package com.testCases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.ApplicationSpecifics.ProjectSpecificMethods;
import com.qa.homepage.AmazonHomePage;

public class LaptopTC extends ProjectSpecificMethods {
	
	
	@Test
	public void  TC_001_AppleLaptopFunctionality () throws IOException{
		
		new AmazonHomePage().tooltipClick().clickMobilesAndComputers().clickLaptops().EnterAppleLaptop();
			System.out.println("apple flow success however this has to be logged in extent reporting");
	
	}
	
	@Test
	public void  TC_002_AcerLaptopFunctionality () throws IOException{
		
		new AmazonHomePage().tooltipClick().clickMobilesAndComputers().clickLaptops().EnterAcerLaptop();
			System.out.println("Acer flow success however this has to be logged in extent reporting");
	
	}
	
	@Test
	public void  TC_003_AsusLaptopFunctionality () throws IOException{
		
		new AmazonHomePage().tooltipClick().clickMobilesAndComputers().clickLaptops().EnterAsusLaptop();
			System.out.println("Asus flow success however this has to be logged in extent reporting");
	
	}
	
	



}
