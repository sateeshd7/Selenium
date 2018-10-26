package com.google.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CopyOfGoogleHomePageTest extends BaseClass{

	@Test
	public void verifyGooglePageTittle2() {
		driver.navigate().to("http://Facebook.com");
		String getTitle = driver.getTitle();
		System.out.println(getTitle);
		Assert.assertEquals(getTitle, "Facebook –a log in or sign up");
	}
	
	@Test
	public void verifyGooglePageTittle3() {
		driver.navigate().to("http://Google.com");
		String getTitle = driver.getTitle();
		System.out.println(getTitle);
		Assert.assertEquals(getTitle, "Google");
	}


}
