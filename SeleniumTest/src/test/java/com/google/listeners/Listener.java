package com.google.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		System.out.println("Completed executing test " + arg0.getName());
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		System.out.println("About to begin executing Test " + arg0.getName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("Test Failed " + arg0.getName());
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("Test Skipped " + arg0.getName());
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("Test Started " + arg0.getName());
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		System.out.println("Test passed " + arg0.getName());
	}

	

}
