package org.raysrus;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SampleTest {
	
	@BeforeSuite
	public void beforeTestSuiteMethod() {
		System.out.println("Executing Before Suite Method");
	}
	
	@AfterSuite
	public void afterSuiteMethod() {
		System.out.println("Executing After Suite Method");
	}

	@Test
	public void sampleTestMethod() {
		System.out.println("Executing Sample Test Method");
	}
}
