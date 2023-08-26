package com.facebook;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/com/facebook/feature",
glue = "com.stepdef.facebook",
plugin = {"pretty"
		//"html:Reports/Cucumber_Html_Report",
		//"json:Reports/Cucumber_FB_Json.json",
		//"com.cucumber.listener.ExtentCucumberFormatter:Reports/Cucumber_FB_Extent_report.html"
		},
//strict = true,
//dryRun = true,
monochrome = true)


public class Runner {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	public static void tearDown() {
		driver.manage().deleteAllCookies();
		driver.close();
		
	}
	

}
