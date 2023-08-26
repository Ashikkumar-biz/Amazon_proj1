package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.pom.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DependOnMethods {
	static WebDriver driver;
	
	@Test
	private void setProperty() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	@Test(dependsOnMethods = "setProperty")
	private void launchBrowser() {
		driver.manage().window().maximize();
	}
	@Test(priority=1)
	private void getURL() {
		driver.get("https://adactinhotelapp.com/");
	}
	@Test(dependsOnMethods = "getURL")
	private void username() {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Ashikkumar");
	}
	@Test(priority = 3)
	private void password() {
		WebElement username = driver.findElement(By.id("password"));
		username.sendKeys("password");
	}
	@Test(priority = 4)
	private void login() {
		WebElement login = driver.findElement(By.id("login"));
		login.click();
	}
	@Test(dependsOnMethods = "deletecache")
	private void closeBrowser() {
		driver.close();
	}
	@Test(dependsOnMethods = "login")
	private void deletecache() {
		driver.manage().deleteAllCookies();
	}
	private void assertCheck() {
		Assert.
	}
	
}
