package org.raysrus.testgrouping;

import org.testng.annotations.Test;

public class TestCaseGrouping {

	@Test (groups= {"Regression"})
	public void testOne() {
		System.out.println("Executed testOne ... in Regression group");
	}
	
	@Test (groups= {"Sanity"})
	public void testTwo() {
		System.out.println("Executed testTwo ... in Sanity group");
	}
	
	@Test (groups= {"Smoke Test"})
	public void testThree() {
		System.out.println("Executed testThree ... in Smoke Test group");
	}
	
	@Test (groups= {"Regression", "Sanity"})
	public void testFour() {
		System.out.println("Executed testFour ... in Regression and Sanity group");
	}
}
