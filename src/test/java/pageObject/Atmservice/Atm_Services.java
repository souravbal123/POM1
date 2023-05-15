package pageObject.Atmservice;

import org.openqa.selenium.By;

import testbase.Test_Base;

public class Atm_Services extends Test_Base {
	public static By withdrawFunds = By.xpath("//*[@id=\"rightPanel\"]/ul[1]/li[2]/a");
	public static By transferFunds = By.xpath("//*[@id=\"rightPanel\"]/ul[1]/li[3]/a");
	public static By checkBalances = By.xpath("//*[@id=\"rightPanel\"]/ul[1]/li[4]/a");
	public static By makeDeposit = By.xpath("//*[@id=\"rightPanel\"]/ul[1]/li[5]/a");

	public static void withdrawfund() {
		driver.findElement(withdrawFunds).click();
		log.info("Withdraw fund link is clicked");
		log.info("This is for testing");
	}

	public static void transferfund() {
		driver.findElement(transferFunds).click();
		log.info("trnsfer fund link is clicked");
	}

	public static void checkbalance() {
		driver.findElement(checkBalances).click();
		log.info("check balance link is clicked");
	}

	public void makedeposit() {
		driver.findElement(makeDeposit).click();
		log.info("Make deposit link is clicked");
	}
}
