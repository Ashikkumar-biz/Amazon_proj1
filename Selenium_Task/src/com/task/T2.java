package com.task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ashik kumar\\eclipse-workspace\\Selenium_Task\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/?tag=googinabkkenshoo-21&ascsubtag=5a0285fc-e485-4b01-8932-d4dae4da6e0b&ie=UTF8");
		List<WebElement>link=driver.findElements(By.tagName("a"));
		System.out.println(link.size());
		
		
		for (WebElement a : link)
		{
			System.out.println(a.getText());
		}
		
		
		
	}

}
