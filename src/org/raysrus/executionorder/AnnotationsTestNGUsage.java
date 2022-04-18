package org.raysrus.executionorder;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsTestNGUsage {

	@AfterTest
	public void afterTest() {
		System.out.println("Executing afterTest in AnnotationsTestNGUsage");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Executing beforeClass in AnnotationsTestNGUsage");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("Executing afterClass in AnnotationsTestNGUsage");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Executing afterMethod in AnnotationsTestNGUsage");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("Executing afterSuite in AnnotationsTestNGUsage");
	}
	
	@Test
	public void sampleTest() {
		System.out.println("Executing sampleTest in AnnotationsTestNGUsage");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Executing beforeMethod in AnnotationsTestNGUsage");
	}
}
