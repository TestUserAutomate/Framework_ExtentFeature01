package com.testCases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qa.ApplicationSpecifics.ProjectSpecificMethods;
import com.qa.homepage.AmazonHomePage;

public class TelevisionTC extends ProjectSpecificMethods{
	
	



	@Test
	public void  TC_001_SamsungTelevisionfunctionality () throws IOException{

		new AmazonHomePage().tooltipClick().clickTv_Appliances_Electronics().clicktelevision().enterSamsungTelevision();
		System.out.println("Samsung Television functionality achieved however extent reporting needs to be implemented");
	}
	

	@Test
	public void  TC_002_OnePlusTelevisionfunctionality () throws IOException{

		new AmazonHomePage().tooltipClick().clickTv_Appliances_Electronics().clicktelevision().enterOnePlusTelevision();
		System.out.println("One plus Television functionality achieved however extent reporting needs to be implemented");
	}
	


}
