package com.google.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleHomePageTest extends BaseClass{

	@Test
	public void verifyGooglePageTittle() {
		String appURL = "http://google.com";
		driver.navigate().to(appURL);
		String getTitle = driver.getTitle();
		System.out.println(getTitle);
		Assert.assertEquals(getTitle, "Google");
	}
	
	@Test
	public void verifyGooglePageTittle1() {
		driver.navigate().to("http://youtube.com");
		String getTitle = driver.getTitle();
		System.out.println(getTitle);
		Assert.assertEquals(getTitle, "YouTube");
	}


}
