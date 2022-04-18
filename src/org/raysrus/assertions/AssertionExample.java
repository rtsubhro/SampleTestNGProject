package org.raysrus.assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionExample {

	@Test
	public void testOne() {
		System.out.println("Executing testOne");
		Assert.assertEquals("Hello World", "Hello World");
		System.out.println("Executed testOne");
	}
	
	@Test
	public void testTwo() {
		System.out.println("Executing testTwo");
		Assert.assertEquals("Hello World", "hello world");
		System.out.println("Executed testTwo");
	}
	
	@Test
	public void testThree() {
		System.out.println("Executing testThree");
		Assert.assertTrue(34==34);
		System.out.println("Executed testThree");
	}
	
	@Test
	public void testFour() {
		System.out.println("Executing testFour");
		Assert.assertTrue(34==35);
		System.out.println("Executed testFour");
	}
	
	@Test
	public void testFive() {
		System.out.println("Executing testFive");
		Assert.assertFalse(34==34);
		System.out.println("Executed testFive");
	}
	
	@Test
	public void testSix() {
		System.out.println("Executing testSix");
		Assert.assertFalse(34==35);
		System.out.println("Executed testSix");
	}
}
