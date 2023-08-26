package com.stepdef.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import com.adactin.runner.Test_Runner;
import com.facebook.Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefFaceBook {
	
	WebDriver driver = Runner.driver;
	SoftAssert softAssert = new SoftAssert();
	
	@SuppressWarnings("deprecation")
	@Given("^User launch the Facebook application$")
	public void user_launch_the_Facebook_application() throws Throwable {
	   driver.get("https://www.facebook.com/");
	   String title = driver.getTitle();
	   System.out.println(title);
	   //softAssert.assertEquals(title, "Facebook – log in or sign up");
	   //softAssert.assertAll();
	   org.testng.Assert.assertEquals(title, "Facebook – log in or sign up");
	   //Assert.assertEquals(title, "Facebook – log in or sign up");

	}
	

	@When("^user enter the username  \"([^\"]*)\"$")
	public void user_enter_the_username(String arg1) throws Throwable {
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys(arg1);
	}

	@When("^user enter the password  \"([^\"]*)\"$")
	public void user_enter_the_password(String arg1) throws Throwable {
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys(arg1);
	}


	
	
	
//	@When("^user enter the username$")
//	public void user_enter_the_username() throws Throwable {
//		WebElement username = driver.findElement(By.id("email"));
//		username.sendKeys("zerodimension9@gmail.com");
//	}
//
//	@When("^user enter the password$")
//	public void user_enter_the_password() throws Throwable {
//		WebElement password = driver.findElement(By.id("pass"));
//		password.sendKeys("Dedication");
//		
//	}

	@Then("^user click on Login Button$")
	public void user_click_on_Login_Button() throws Throwable {
		driver.findElement(By.name("login")).click();
	}


	

}
