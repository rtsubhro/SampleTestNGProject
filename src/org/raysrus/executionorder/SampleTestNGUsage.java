package org.raysrus.executionorder;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SampleTestNGUsage {
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Executing beforeTest in SampleTestNGUsage");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Executing beforeSuite in SampleTestNGUsage");
	}

}
