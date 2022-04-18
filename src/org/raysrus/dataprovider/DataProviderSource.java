package org.raysrus.dataprovider;

import java.lang.reflect.Method;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

public class DataProviderSource {

	@DataProvider(name="testTypeDataProvider")
	public Object[][] getTestTypeData(ITestContext context){
		String testTypeName = context.getName();
		
		if("Integration Level".equals(testTypeName)) {
			return new Object[][] {
				{"Integration Test Data"}
			};
		} else if ("Acceptance Level".equals(testTypeName)) {
			return new Object[][] {
				{"Acceptance Test Data"}
			};
		} else return new Object[][] {
			{"Common Scenario Test Data"}
		};
	}
	
	@DataProvider(name="scenarioDataProvider")
	public Object[][] getScenarioData(Method method) {
		String methodName = method.getName();
		
		if("scenario1".equals(methodName)) {
			return new Object[][] {
				{"Scenario 1 Test Data"}
			};
		}else if("scenario2".equals(methodName)) {
			return new Object[][] {
				{"Scenario 2 Test Data"}
			};
		}else return new Object[][] {
			{"Common Scenarios Test Data"}
		};
	}
}
