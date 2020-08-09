package com.listeners;

import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest {

	
	@Test
	public void loginByEmail() {
		System.out.println("Login by Email");
		Assert.assertEquals("Nithin","Nithin");
	}
	@Test
	public void loginByFacebook() {
		System.out.println("Login by Facebook");
		Assert.assertEquals("Nithin","Pavnen");
	}
}
