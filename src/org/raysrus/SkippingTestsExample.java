package org.raysrus;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkippingTestsExample {
	
	@Test
	public void testOne() {
		System.out.println("Executing testOne");
	}

	@Test (enabled=false)
	public void testTwo() {
		System.out.println("Executing testTwo");
	}
	
	@Test
	public void testThree() {
		System.out.println("Executing testThree");
		
		throw new SkipException("Deliberately Skipping testThree, as this is incomplete");
	}
	
	@Test
	public void testFour() {
		System.out.println("Executing testFour");
	}
}
