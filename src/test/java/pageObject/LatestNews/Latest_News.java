package pageObject.LatestNews;

import org.openqa.selenium.By;

import testbase.Test_Base;

public class Latest_News extends Test_Base {
	public static By bankReopen = By.xpath("//*[@id=\"rightPanel\"]/ul[3]/li[2]/a");
	public static By onlineBillpay = By.xpath("//*[@id=\"rightPanel\"]/ul[3]/li[3]/a");
	public static By onlineAccountTransfer = By.xpath("//*[@id=\"rightPanel\"]/ul[3]/li[4]/a");

	public static void bankreopen() {
		driver.findElement(bankReopen).click();
		log.info("bankReopen link is clicked");
	}

	public static void onlinebillpay() {
		driver.findElement(onlineBillpay).click();
		log.info("onlineBillpay link is clicked");
	}

	public static void onlineaccounttransfer() {
		driver.findElement(onlineAccountTransfer).click();
		log.info("onlineAccountTransfer link is clicked");
	}
}
