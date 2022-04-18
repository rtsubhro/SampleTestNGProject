package org.raysrus;

import org.testng.annotations.Test;

public class PriorityOfTestsExample {

	@Test
	public void testOne() {
		System.out.println("Hello, I am testOne");
	}
	
	@Test (priority=1)
	public void testTwo() {
		System.out.println("Hello, I am testTwo");
	}
	
	@Test (priority=2)
	public void testThree() {
		System.out.println("Hello, I am testThree");
	}
	
	@Test (priority=3)
	public void testFour() {
		System.out.println("Hello, I am testFour");
	}
}
