package org.raysrus.dataprovider;

import org.testng.annotations.Test;

public class DataProviderIntegrationTestExample {

	@Test(dataProvider="testTypeDataProvider", dataProviderClass=DataProviderSource.class)
	public void integrationTest(String data) {
		System.out.println("Integration Test: Data("+data+")");
	}
}
