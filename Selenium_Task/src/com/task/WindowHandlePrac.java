package com.task;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlePrac {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Ashik kumar\\eclipse-workspace\\Selenium_Task\\Driver\\chromedriverv110.exe");
		WebDriver driver = new ChromeDriver();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		//WebElement one = driver.findElement(By.xpath("//button[@id='newWindowBtn']"));
		WebElement one = driver.findElement(By.xpath("//button[@id='newWindowBtn']"));
		WebElement two = driver.findElement(By.xpath("//button[@id='newTabBtn']"));
		WebElement three = driver.findElement(By.xpath("//button[@id='newWindowsBtn']"));
		WebElement four = driver.findElement(By.xpath("//button[@id='newTabsBtn']"));
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		wait.until(ExpectedConditions.elementToBeClickable(one));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click();", one);
//		String currentWindow = driver.getWindowHandle();
//		System.out.println(currentWindow);
		j.executeScript("arguments[0].click();", two);
		j.executeScript("arguments[0].click();",three);
		j.executeScript("arguments[0].click();", four);
		
		String parentwindow = driver.getWindowHandle();
		System.out.println("This is the parent window" + parentwindow);
		Set<String> windows = driver.getWindowHandles();
		ArrayList<String> windowList= new ArrayList<String>();
		windowList.addAll(windows);
		
		System.out.println(windowList);
		driver.switchTo().window(windowList.get(1));
		driver.close();
		
		driver.switchTo().window(windowList.get(2));
		String thirdwindow = driver.getWindowHandle();
		System.out.println("Third window"+thirdwindow);
		
		driver.switchTo().window(parentwindow);
		System.out.println(driver.getWindowHandle());
		
//		for(String x : windows) {
//			System.out.println(x);
//			windowList.add(x);
//		}
		
		//one.click();
//		two.click();
//		three.click();
//		four.click();
//		Set<String> windows=driver.getWindowHandles();
//		System.out.println(windows);
		driver.quit();
	}

}
