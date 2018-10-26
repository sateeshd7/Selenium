package com.google.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	public static WebDriver driver;

	@BeforeSuite
	public void testSetUp() {

		System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Sateesh\\Softwares\\Drivers\\chromedriver1.exe");
		System.out.println("setup");
		driver = new ChromeDriver();
		
	}
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}
}
