package com.task;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hotel_Booking_Adactin {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Driver\\chromedriverv110.exe");
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashik kumar\\eclipse-workspace\\Selenium_Task\\Driver\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("http://adactinhotelapp.com/");
		d.findElement(By.id("username")).sendKeys("Ashikkumar");
		d.findElement(By.id("password")).sendKeys("Qwertyuiop@1");
		d.findElement(By.id("login")).click();
		
		WebElement list1 = d.findElement(By.xpath("//select[@id='location']"));	
		Select ls1 = new Select(list1);
		ls1.selectByValue("London");
		
		Select ls2 = new Select (d.findElement(By.xpath("//select[@id='hotels']")));
		ls2.selectByValue("Hotel Sunshine");
		
		//Select ls3 = new Select (d.findElement(By.xpath("//select[@id='room_type']")));
		Select ls3 = new Select(d.findElement(By.id("room_type")));
		ls3.selectByValue("Super Deluxe");
		
		Select ls4 = new Select (d.findElement(By.xpath("//select[@id='room_nos']")));
		ls4.selectByValue("1");
		
		WebElement checkIn = d.findElement(By.id("datepick_in"));
		checkIn.clear();
		checkIn.sendKeys("30/12/2022");
		
		WebElement checkout = d.findElement(By.id("datepick_out"));
		checkout.clear();
		checkout.sendKeys("02/01/2023");
		
		Select adult = new Select (d.findElement(By.xpath("//select[@id='adult_room']")));
		adult.selectByValue("2");
		
		d.findElement(By.xpath("//input[@id='Submit']")).click();
		
		d.findElement(By.id("radiobutton_0")).click();
		d.findElement(By.id("continue")).click();
		
		//d.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Ashik");
//		JavascriptExecutor js = (JavascriptExecutor) d;
//		
//		WebElement name = d.findElement(By.xpath("//input[@id='first_name']"));
//		js.executeScript("arguments[0].scrollIntoView(true);", name);
//		Thread.sleep(2000);
//		name.sendKeys("Ashik");
		
		WebElement name = new WebDriverWait(d, 5)
			    .until(ExpectedConditions.visibilityOfElementLocated(By.id("first_name")));
			name.sendKeys("Ashik");

		
		d.findElement(By.xpath("//input[@id='last_name']")).sendKeys("//input[@id='last_name']");
		d.findElement(By.xpath("//textarea[@id='address']")).sendKeys("Salem");
		d.findElement(By.xpath("//input[@id='cc_num']")).sendKeys("1234567812345678");
		d.findElement(By.xpath("//input[@id='cc_cvv']")).sendKeys("2134");
		
		Select ls5 = new Select (d.findElement(By.xpath("//select[@id='cc_type']")));
		ls5.selectByValue("AMEX");
		
		Select ls6 = new Select (d.findElement(By.xpath("//select[@id='cc_exp_month']")));
		ls6.selectByValue("2");
		
		Select ls7 = new Select (d.findElement(By.xpath("//select[@id='cc_exp_year']")));
		ls7.selectByValue("2022");
		
	
		
		d.findElement(By.id("book_now")).click();
		
		
		
		
		//Thread.sleep(10000);
		//d.close();
	}

}
