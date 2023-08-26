package com.task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ashik kumar\\eclipse-workspace\\Selenium_Task\\Driver\\chromedriverv110.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		
		
		//By sendkeys method
		WebElement w = driver.findElement(By.id("uploadfile_0"));
//		w.sendKeys("C:\\Users\\Ashik kumar\\Downloads\\testupload.jpeg");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		js.executeScript("arguments[0].click();", w);
		//ByRobot Method
		
		
//		Robot rob = new Robot();
//		rob.delay(2000);
//		
//		StringSelection ss = new StringSelection("C:\\Users\\Ashik kumar\\Downloads\\testupload.jpeg");
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//		
//		rob.keyPress(KeyEvent.VK_CONTROL);
//		rob.keyPress(KeyEvent.VK_V);
//		
//		rob.keyRelease(KeyEvent.VK_CONTROL);
//		rob.keyRelease(KeyEvent.VK_V);
//		
//		rob.keyPress(KeyEvent.VK_ENTER);
//		rob.keyRelease(KeyEvent.VK_ENTER);
//		
//		driver.findElement(By.id("terms")).click();
		//driver.findElement(By.id("submitbutton")).click();
		//driver.close();
		
		
		
	}

}
