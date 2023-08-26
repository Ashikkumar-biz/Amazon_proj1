package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import com.adactin.runner.Test_Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	
	public static WebDriver driver = Test_Runner.driver;
	SoftAssert softAssert = new SoftAssert();
	
	@Given("^user Launch The Adactin Application$")
	public void user_Launch_The_Adactin_Application() throws Throwable {
		driver.get("https://adactinhotelapp.com/");
		String title =  driver.getTitle();
		softAssert.assertEquals("title", "Adactin.comReservation System");
		softAssert.assertAll()
	}

	@When("^user Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Ashikkumar");
	}

	@When("^user Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
		driver.findElement(By.id("password")).sendKeys("Qwertyuiop@1");
	}

	@Then("^user Click The Login Button And It Navigates To Search Hotel Page$")
	public void user_Click_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page() throws Throwable {
		driver.findElement(By.id("login")).click();
	}

	@When("^user Select Location From The Location Dropdown$")
	public void user_Select_Location_From_The_Location_Dropdown() throws Throwable {
		WebElement list1 = driver.findElement(By.xpath("//select[@id='location']"));	
		Select ls1 = new Select(list1);
		ls1.selectByValue("London");
	}

	@When("^user Select Hotel From Hotels Dropdown$")
	public void user_Select_Hotel_From_Hotels_Dropdown() throws Throwable {
		Select ls2 = new Select (driver.findElement(By.xpath("//select[@id='hotels']")));
		ls2.selectByValue("Hotel Sunshine");
	}

	@When("^user Select Room Type From Room Type Dropdown$")
	public void user_Select_Room_Type_From_Room_Type_Dropdown() throws Throwable {
		WebElement ls = driver.findElement(By.id("room_type"));
		Select ls2 = new Select(ls);
		ls2.selectByValue("Super Deluxe");
	}

	@When("^user select Number Of Rooms From Number Of Rooms from Number Of Rooms Dropdown$")
	public void user_select_Number_Of_Rooms_From_Number_Of_Rooms_from_Number_Of_Rooms_Dropdown() throws Throwable {
		Select ls = new Select(driver.findElement(By.id("room_nos")));
		ls.selectByValue("1");
	}

	@When("^user Enter Check In Date In Check In Date Field$")
	public void user_Enter_Check_In_Date_In_Check_In_Date_Field() throws Throwable {
		WebElement ls = driver.findElement(By.name("datepick_in"));
		ls.clear();
		ls.sendKeys("30/12/2022");
	}

	@When("^user Enter Check Out Date In Check Out Date Field$")
	public void user_Enter_Check_Out_Date_In_Check_Out_Date_Field() throws Throwable {
		WebElement ls = driver.findElement(By.id("datepick_out"));
		ls.clear();
		ls.sendKeys("02/01/2023");
	}

	@When("^user Select Number Of Adults In Adults Per Room Dropdown$")
	public void user_Select_Number_Of_Adults_In_Adults_Per_Room_Dropdown() throws Throwable {
		WebElement ls = driver.findElement(By.id("adult_room"));
		Select ls2 = new Select(ls);
		ls2.selectByValue("2");
		
	}

	@When("^user Select Number of Children In Children Per Room Dropdown$")
	public void user_Select_Number_of_Children_In_Children_Per_Room_Dropdown() throws Throwable {
		Select ls = new Select (driver.findElement(By.id("child_room")));
		ls.selectByValue("0");		
	}

	@Then("^user Click Search Button And It Navigates To Select Hotel Page$")
	public void user_Click_Search_Button_And_It_Navigates_To_Select_Hotel_Page() throws Throwable {
		driver.findElement(By.xpath("//input[@id='Submit']")).click();
	}

	@When("^user Select Hotel From the Hotel List$")
	public void user_Select_Hotel_From_the_Hotel_List() throws Throwable {
		
	}

	@When("^user Select Hotel By Click The Radio Button$")
	public void user_Select_Hotel_By_Click_The_Radio_Button() throws Throwable {
		driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();
	}

	@Then("^user Click The Continue Button And It Navigates to Hotel Booking Page$")
	public void user_Click_The_Continue_Button_And_It_Navigates_to_Hotel_Booking_Page() throws Throwable {
		driver.findElement(By.id("continue")).click();;
		//Thread.sleep(2000);
	}

	@When("^user Enter First Name In First Name Field$")
	public void user_Enter_First_Name_In_First_Name_Field() throws Throwable {
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Ashik");
		//wait(2000);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		
//		WebElement name = driver.findElement(By.xpath("//input[@id='first_name']"));
//		js.executeScript("arguments[0].scrollIntoView(true);", name);
		//Thread.sleep(2000);
		//wait(2000);
//		name.sendKeys("Ashik");
//		
//		WebElement name = new WebDriverWait(driver, 5)
//			    .until(ExpectedConditions.visibilityOfElementLocated(By.id("first_name")));
//			name.sendKeys("Ashik");
	}

	@When("^user Enter Last Name In Last Name Field$")
	public void user_Enter_Last_Name_In_Last_Name_Field() throws Throwable {
		driver.findElement(By.id("last_name")).sendKeys("C K");
	}

	@When("^user Enter Address In Billing Address Field$")
	public void user_Enter_Address_In_Billing_Address_Field() throws Throwable {
		driver.findElement(By.xpath("//textarea[@class='txtarea']")).sendKeys("Salem");
	}

	@When("^user Enter Card Number In Credit Card No Field$")
	public void user_Enter_Card_Number_In_Credit_Card_No_Field() throws Throwable {
		driver.findElement(By.xpath("//input[@id='cc_num']")).sendKeys("1234123412341234");
	}

	@When("^user Select Card Type In Credit Card Type Dropdown$")
	public void user_Select_Card_Type_In_Credit_Card_Type_Dropdown() throws Throwable {
		Select ls = new Select (driver.findElement(By.xpath("//select[@id='cc_type']")));
		ls.selectByValue("VISA");
	}

	@When("^user Enter Expiry Date In Select Month and Select Year Field$")
	public void user_Enter_Expiry_Date_In_Select_Month_and_Select_Year_Field() throws Throwable {
		Select ls = new Select(driver.findElement(By.xpath("//select[@id='cc_exp_month']")));
		ls.selectByValue("1");
		Select ls2 = new Select(driver.findElement(By.xpath("//select[@id='cc_exp_year']")));
		ls2.selectByValue("2022");
		
	}

	@When("^user Enter CVV Number In CVV Number Field$")
	public void user_Enter_CVV_Number_In_CVV_Number_Field() throws Throwable {
		driver.findElement(By.id("cc_cvv")).sendKeys("123");
		
	}

	@Then("^user Click Book Now Button And It Navigates To Booking Confirmation Page$")
	public void user_Click_Book_Now_Button_And_It_Navigates_To_Booking_Confirmation_Page() throws Throwable {
		driver.findElement(By.id("book_now")).click();
	}

	@When("^user Verifies The Given Details$")
	public void user_Verifies_The_Given_Details() throws Throwable {
		driver.findElement(By.id("book_now"));
	}

	@Then("^user CLick The Logout Button and It Navigates And Display \"([^\"]*)\"$")
	public void user_CLick_The_Logout_Button_and_It_Navigates_And_Display(String arg1) throws Throwable {
		driver.findElement(By.id("book_now")).click();
		
	}


}
