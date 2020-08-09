package com.testCases;


import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.qa.ApplicationSpecifics.ProjectSpecificMethods;
import com.qa.homepage.AmazonHomePage;

public class MobileTC extends ProjectSpecificMethods{





	@Test
	public void  TC_001_LGMobileFunctionality () throws IOException{

		new AmazonHomePage().tooltipClick().
		clickMobilesAndComputers().clickMobiles().enterLGMobile();
		System.out.println("LG mobile functionality achieved however extent reporting needs to be implemented");
	}
	

	@Test
	public void  TC_002_OppoMobileFunctionality () throws IOException{

		new AmazonHomePage().tooltipClick().
		clickMobilesAndComputers().clickMobiles().enterOppoMobile();
		System.out.println("Oppo mobile functionality achieved however extent reporting needs to be implemented");
	}

	

	@Test
	public void  TC_003_RealmeMobileFunctionality () throws IOException{

		new AmazonHomePage().tooltipClick().
		clickMobilesAndComputers().clickMobiles().enterRealmeMobile();
		System.out.println("Realme mobile functionality achieved however extent reporting needs to be implemented");
	}


}


