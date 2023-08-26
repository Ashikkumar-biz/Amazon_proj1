package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel_Page {
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@id='radiobutton_0']") private WebElement radioButton;
	@FindBy(id = "continue") private WebElement continueButton;
	
	public SelectHotel_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getradioButton() {
		return radioButton;
	}
	public WebElement getcontinue() {
		return continueButton;
	}

}
