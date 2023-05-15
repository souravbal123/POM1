package pageObject.Onlineservices;

import org.openqa.selenium.By;

import testbase.Test_Base;

public class Online_Services extends Test_Base {
	public static By billPay = By.xpath("//*[@id=\"rightPanel\"]/ul[2]/li[2]/a");
	public static By accountHistory = By.xpath("//*[@id=\"rightPanel\"]/ul[2]/li[3]/a");
	public static By transferFund = By.xpath("//*[@id=\"rightPanel\"]/ul[2]/li[4]/a");

	public static void billpay() {
		driver.findElement(billPay).click();
		log.info("Billpay link is clicked");
	}

	public static void accounthistory() {
		driver.findElement(accountHistory).click();
		log.info("Account history link is clicked");
	}

	public static void transferfund() {
		driver.findElement(transferFund).click();
		log.info("Transfer fund link is clicked");
	}
}
