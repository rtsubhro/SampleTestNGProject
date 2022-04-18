package org.raysrus;

import org.testng.annotations.Test;

public class FacebookLogin {
	
	@Test
	public void loginWithValidCredentials() {
		System.out.println("I am successfully logged in");
	}
	
	@Test
	public void loginWithInvalidCredentials() {
		System.out.println("I am unable to log in");
	}
	
	@Test
	public void loginWithInvalidUserName() {
		System.out.println("I am unable to log in");
	}

}
