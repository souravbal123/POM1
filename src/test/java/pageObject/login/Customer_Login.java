package pageObject.login;

import org.openqa.selenium.By;

import testbase.Test_Base;

public class Customer_Login extends Test_Base {

	public static By UserName = By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input");
	public static By Password = By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input");
	public static By logIn = By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input");
	public static By forgotLink = By.xpath("//*[@id=\"loginPanel\"]/p[1]/a");
	public static By registerLink = By.xpath("//*[@id=\"loginPanel\"]/p[2]/a");

	public static void enterUsername() {
		driver.findElement(UserName).sendKeys("souravbal");
		log.info("Username Entered");
	}

	public static void enterPassword() {
		driver.findElement(Password).sendKeys("Sourav@123");
		log.info("Password entered");
	}

	public static void login() {
		driver.findElement(logIn).click();
		log.info("User logged in");
	}

	public static void forgotlink() {
		driver.findElement(forgotLink).click();
		log.info("Forgot login info link clicked");
	}

	public static void register() {
		driver.findElement(registerLink).click();
		log.info("Register link clicked");
	}
}
