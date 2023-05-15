package testcases;

import org.testng.annotations.Test;

import pageObject.Onlineservices.Online_Services;

public class Testcase4_onlineServices extends Online_Services {
	@Test
	public void onlineServicelink_Validation() {
		billpay();
		accounthistory();
		transferfund();
	}
}
