package com.task;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ashik kumar\\eclipse-workspace\\Selenium_Task\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.findElement(By.id("ap_email")).sendKeys("ckashikkumar@gmail.com");
		WebElement x=driver.findElement(By.id("continue"));
		x.click();
		driver.findElement(By.name("password")).sendKeys("04121982");
		driver.findElement(By.id("signInSubmit")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.get("https://casegear.in/pages/store");
		
		//driver.findElement(By.className("block mb-[5px] leading-normal sf__pcard-name font-medium truncate-lines hover:text-color-secondary")).click();
		
		WebElement link = driver.findElement(By.tagName("a"));
		
		System.out.println(link);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}

}
