package com.task;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shadow_Dom {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashik kumar\\eclipse-workspace\\Selenium_Task\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://books-pwakit.appspot.com/");
		
		//host
		WebElement host = driver.findElement(By.tagName("book-app"));
		
		//shadow dom
		JavascriptExecutor j = (JavascriptExecutor) driver;
		SearchContext shadowRoot =  (SearchContext) j.executeScript("return arguments[0].shadowRoot",host);
		WebElement shadowdom=shadowRoot.findElement(By.cssSelector("#shadowcontentcss"));
		
		//app-header
		WebElement appheader = shadowdom.findElement(By.tagName("app-header"));
		
		//app-toolbar
		WebElement apptool = appheader.findElement(By.cssSelector("app-toolbar.toolbar-bottom"));
		
		//book input decorator
		WebElement bookInput = apptool.findElement(By.tagName("book-input-decorator"));
		
		//input
		bookInput.findElement(By.cssSelector("input#input")).sendKeys("GMV Books");
		
		//search box
		//bookInput.findElement(By.id("book-input-decorator")).sendKeys("GMV books");
		
		driver.close();
	}

}
