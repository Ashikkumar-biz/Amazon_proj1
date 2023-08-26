package com.task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Axes {
	
	/*
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashik kumar\\eclipse-workspace\\Selenium_Task\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		driver.manage().window().maximize();
		
		//self node
		String self = driver.findElement(By.xpath("//a[contains(.,'Raymond Ltd')]/self :: a")).getText();
		System.out.println("The self node is "+self);
		//parent node
		String parent = driver.findElement(By.xpath("//a[contains(.,'Raymond Ltd')]/parent::*")).getText();
		System.out.println("The parent node is "+ parent);
		
		//child node
		List<WebElement> childs = ( driver.findElements(By.xpath("//a[normalize-space()='Raymond Ltd']/ancestor::tr/child::*")));
		System.out.println("The no.of child nodes are "+ childs.size());
		
		//Ancestor node
		String ancestor = driver.findElement(By.xpath("//a[normalize-space()='Raymond Ltd']/ancestor::tr")).getText();
		System.out.println("The no of ancestor nodes are " + ancestor);
		
		//following
		List<WebElement> follwing = driver.findElements(By.xpath("//a[contains(.,'Raymond Ltd')]/following::*"));
		System.out.println("The no of following elements are" +  follwing.size());
		
		//following sibling
		List<WebElement> followingSibling = driver.findElements(By.xpath("//a[contains(.,'Raymond Ltd')]/ancestor::tr/following-sibling::*"));
		System.out.println("The number of following sibling are" + followingSibling.size());
		
		// preceding and following are same type 
		//preceding sibling
		List<WebElement> pre = driver.findElements(By.xpath("//a[normalize-space()='Raymond Ltd']/ancestor::tr/preceding-sibling::*"));
		System.out.println("The number of preceding sibling are" + pre.size());
		
		
		Thread.sleep(1000);
		driver.close();
		*/
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashik kumar\\eclipse-workspace\\Selenium_Task\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		driver.manage().window().maximize();
		
		
	}
	
	
	

}
