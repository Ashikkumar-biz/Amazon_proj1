package com.task;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetCurrentURL{
	public static WebDriver driver;
//	public static void scrolldown(int pixels) {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		String script = String.format("window.scrollBy(0,%d)", pixels);
//		js.executeScript(script);
//	}
//	
//	public static void scrollMovement(String Type, int x , int y) {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		if(Type.equalsIgnoreCase("scrollBy")) {
//			js.executeScript("window.scrollBy(x,y)","");
//		}
//	}
	
	public static void scrolldown(String Type, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.
			js.executeScript(Type,element);
	}
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\Driver\\chromedriverv110.exe");
		
			
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		scrolldown(1500);

		
		
//		driver.get("https://en-gb.facebook.com/index.php?stype=lo&jlou=AfdS-wiQs2g7uyqU1vxsfK-huUwggC0QONcjBcfweECRaAn1BlIpWXUTJ1ml84iG48lUiuEhihpzxV-kZ9IjZYK0qHLk07Dwf0Tm-ZhVg4OM9A&smuh=25784&lh=Ac8C3ZMaO-6nUCiE");
//		WebElement utube = driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']"));
//		WebDriverWait wait = new WebDriverWait(driver, 30);
//		wait.until(ExpectedConditions.visibilityOf(utube));
//		driver.get("https://www.youtube.com/");
//		String url = driver.getCurrentUrl();
//		System.out.println(url);
//		WebElement searchbox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
//		//searchbox.click();
//		String attribute = searchbox.getAttribute("placeholder");
//		System.out.println(attribute);
		
//		String url = driver.getCurrentUrl();
//		System.out.println(url);
	}

}
