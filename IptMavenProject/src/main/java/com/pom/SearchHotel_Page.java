package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchHotel_Page {
	public WebDriver driver;
	
	@FindBy(xpath = "//select[@id='location']") private WebElement location;
	@FindBy(xpath = "//select[@id='hotels']") private WebElement hotels;
	@FindBy(xpath = "//select[@id='room_type']") private WebElement room;
	@FindBy(id = "room_nos") private WebElement roomNo;
	@FindBy(id = "datepick_in") private WebElement dateIn;
	@FindBy(id = "datepick_out") private WebElement dateOut;
	@FindBy(id = "adult_room") private WebElement adultNo;
	@FindBy(id = "child_room") private WebElement childNo;
	@FindBy(xpath = "//input[@id='Submit']") private WebElement search;
	
	public SearchHotel_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoom() {
		return room;
	}
	public WebElement getroomNo() {
		return roomNo;
	}
	public WebElement getDateIn() {
		return dateIn;
	}
	public WebElement getDateOut() {
		return dateOut;
	}
	public WebElement getadultNo() {
		return adultNo;
	}
	public WebElement getChildNo() {
		return childNo;
	}
	public WebElement getSearch() {
		return search;
	}
	
}
