package testcases;

import org.testng.annotations.Test;

import pageObject.login.Customer_Login;

public class Testcase1_login extends Customer_Login {
	@Test
	public void accountValidation() {
		enterUsername();
		enterPassword();
		login();
		forgotlink();
		register();
	}
}