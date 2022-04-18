package org.raysrus.assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {

	@Test
	public void testOne() {
		SoftAssert softAssert = new SoftAssert();
		System.out.println("Executing testOne");
		softAssert.assertEquals(5, 5, "testOne: first softAssert failed");
		softAssert.assertTrue("Hello".equals("hello"), "testOne: second softAssert failed");
		System.out.println("Executed testOne successfully even though it should have failed, as no assertAll()");
	}
	
	@Test
	public void testTwo() {
		SoftAssert softAssert = new SoftAssert();
		System.out.println("Executing testTwo");
		softAssert.assertEquals(5, 5, "testTwo: first softAssert failed");
		softAssert.assertTrue("Hello".equals("hello"), "testTwo: second softAssert failed");
		System.out.println("Executed testTwo");
		softAssert.assertAll();
	}
	
	@Test
	public void testThree() {
		SoftAssert softAssert = new SoftAssert();
		System.out.println("Executing testThree");
		softAssert.assertEquals(5, 5, "testThree: first softAssert failed");
		softAssert.assertTrue("Hello".equals("Hello"), "testThree: second softAssert failed");
		System.out.println("Executed testThree");
		softAssert.assertAll();
	}
}
