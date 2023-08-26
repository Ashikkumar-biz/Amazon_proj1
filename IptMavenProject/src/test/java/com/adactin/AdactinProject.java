package com.adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.baseclass.BaseClass;

public class AdactinProject extends BaseClass{
	public static WebDriver driver;
	
	public static void main(String[] args) {
		driver=launchBrowser("chrome");
		getUrl("https://adactinhotelapp.com/");
		WebElement username = driver.findElement(By.id("username"));
		passInput(username,"Ashikkumar");
		WebElement password = driver.findElement(By.id("password"));
		passInput(password,"Qwertyuiop@1");
		WebElement login = driver.findElement(By.id("login"));
		clickOnElement(login);		
	}
	
	

}
