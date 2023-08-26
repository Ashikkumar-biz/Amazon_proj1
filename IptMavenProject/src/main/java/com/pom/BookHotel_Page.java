package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel_Page {
public WebDriver driver;
	
	@FindBy(xpath = "//input[@id='first_name']") private WebElement firstName;
	@FindBy(id = "last_name") private WebElement lastName;
	@FindBy(xpath = "//textarea[@class='txtarea']") private WebElement billAddress;
	@FindBy(xpath = "//input[@id='cc_num']") private WebElement ccNum;
	@FindBy(xpath = "//select[@id='cc_type']") private WebElement type;
	@FindBy(xpath = "//select[@id='cc_exp_month']") private WebElement expMonth;
	@FindBy(xpath = "//select[@id='cc_exp_year']") private WebElement expYear;
	@FindBy(id = "cc_cvv") private WebElement cvv;
	@FindBy(id = "book_now") private WebElement bookNow;
	
	public BookHotel_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getfirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getBillAddress() {
		return billAddress;
	}
	public WebElement getCcNum() {
		return ccNum;
	}
	public WebElement getType() {
		return type;
	}
	public WebElement getExpMonth() {
		return expMonth;
	}
	public WebElement getExpYear() {
		return expYear;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement bookNow() {
		return bookNow;
	}
}
