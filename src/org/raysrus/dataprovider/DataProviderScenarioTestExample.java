package org.raysrus.dataprovider;

import org.testng.annotations.Test;

public class DataProviderScenarioTestExample {

	@Test(dataProvider="scenarioDataProvider", dataProviderClass=DataProviderSource.class)
	public void scenario1(String data) {
		System.out.println("Scenario Testing: Data(" + data + ")");
	}
	
	@Test(dataProvider="scenarioDataProvider", dataProviderClass=DataProviderSource.class)
	public void scenario2(String data) {
		System.out.println("Scenario Testing: Data(" + data + ")");
	}
	
	@Test(dataProvider="scenarioDataProvider", dataProviderClass=DataProviderSource.class)
	public void commonScenarios(String data) {
		System.out.println("Common Scenarios Testing: Data(" + data + ")");
	}
}
