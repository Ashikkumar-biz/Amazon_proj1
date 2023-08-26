package com.task;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrnshot {
	public static void main(String[] args) throws IOException, InterruptedException {
		
	
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/mozilla/geckodriver/releases/");
	
		/*
	TakesScreenshot ts = (TakesScreenshot) driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	File trg = new File("C:\\Users\\Ashik kumar\\eclipse-workspace\\Selenium_Task\\Scrnshot\\home.png");
	FileUtils.copyFile(src, trg);
		*/
	
	String filename = ("Home");
	File ts = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
	FileUtils.copyFile(ts, new File(".\\Scrnshot\\"+filename+".png"));
	
	

	}

}
