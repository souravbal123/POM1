package testcases;

import org.testng.annotations.Test;

import pageObject.LatestNews.Latest_News;

public class Testcase3_latestNews extends Latest_News {
	@Test
	public void latestnewslink_Validation() {
		bankreopen();
		onlinebillpay();
		onlineaccounttransfer();
	}
}
