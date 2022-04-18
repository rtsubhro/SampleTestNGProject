package org.raysrus.dataprovider;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SimpleDataProviderExample {
	
	@Test(dataProvider="secondDataSet")
	public void testAddition (int received, int expectedValue) {
		int actualValue = received + 20;
		Assert.assertEquals(actualValue, expectedValue);
	}
	
	@DataProvider
	private Object[][] getFirstDataSet(){
		return new Object[][]{
			{100, 120},
			{200, 220},
			{300, 310},
			{400, 420}
		};
	}
	
	@DataProvider(name="secondDataSet")
	private Object[][] getSecondDataSet(){
		return new Object[][] {
			{10, 30},
			{30, 60},
			{50, 70}
		};
	}

}
