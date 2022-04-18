package org.raysrus.dataprovider;

import org.testng.annotations.Test;

public class DataProviderAcceptanceTestExample {

	@Test(dataProvider="testTypeDataProvider", dataProviderClass=DataProviderSource.class)
	public void acceptanceTest(String data) {
		System.out.println("Acceptance Test: Data("+ data +")");
	}
}
