package testcases;

import org.testng.annotations.Test;

import pageObject.Atmservice.Atm_Services;

public class Testcase2_atmServices extends Atm_Services {
	@Test
	public void atmServiceslink_Validation() {
		withdrawfund();
		transferfund();
		checkbalance();
		makedeposit();

	}
}
