package org.raysrus.parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestParametersViaXmlFile {

	@Test
	@Parameters("browser")
	public void testOne(String browser) {
		System.out.println("Browser Name is: " + browser);
	}
	
	@Test
	@Parameters({"userName", "password"})
	public void testTwo(String userName, String password) {
		System.out.println("User Name is: " + userName);
		System.out.println("Password is: " + password);
	}
}
