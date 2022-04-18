package org.raysrus.listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SampleTestListenersExample {
	
	@Test
	public void testOne() {
		System.out.println("Executing testOne");
	}

	@Test(dataProvider="getData")
	public void testTwo(String data) {
		System.out.println("Executing testTwo with input: " + data);
	}
	
	@DataProvider(name="getData")
	public Object[] getData() {
		return new Object[] {"A", "B"};
	}
	
	@Test
	public void testThree() {
		System.out.println("Executing testThree");
		Assert.assertEquals(50, 55);
	}
	
	@Test
	public void testFour() {
		System.out.println("Executing testFour");
		throw new SkipException("test failed deliberately");
	}
}
