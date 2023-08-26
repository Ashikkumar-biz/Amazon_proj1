package com.adactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import com.baseclass.BaseClass;
import com.pom.LoginPage;
import com.sdp.PageObjectManager;

public class AdactinRunnerPom extends BaseClass {
	public static WebDriver driver = launchBrowser("chrome");
	public static PageObjectManager pom = new PageObjectManager(driver);
	
	public static void main(String[] args) {
		
		getUrl("https://adactinhotelapp.com/");
		passInput(pom.getInstanceLp().getusername(),"Ashikkumarck");
		passInput(pom.getInstanceLp().getpassword(),"Qwertyuiop@1");
		clickOnElement(pom.getInstanceLp().getlogin());
		
		dropdown(pom.getInstanceSearch().getLocation(),"selectByValue", "London");
		dropdown(pom.getInstanceSearch().getHotels(),"selectByValue","Hotel Sunshine");
		dropdown(pom.getInstanceSearch().getRoom(),"selectByValue","Super Deluxe");
		dropdown(pom.getInstanceSearch().getroomNo(),"selectByValue","1");
		clear(pom.getInstanceSearch().getDateIn());
		passInput(pom.getInstanceSearch().getDateIn(),"30/12/2022");
		clear(pom.getInstanceSearch().getDateOut());
		passInput(pom.getInstanceSearch().getDateOut(),"02/01/2023");
		dropdown(pom.getInstanceSearch().getadultNo(),"SelectByvalue","2");
		dropdown(pom.getInstanceSearch().getChildNo(),"selectbyvalue","0");
		clickOnElement(pom.getInstanceSearch().getSearch());
		
		clickOnElement(pom.getInstanceSelect().getradioButton());
		clickOnElement(pom.getInstanceSelect().getcontinue());
		
		passInput(pom.getInstanceBook().getfirstName(),"Ashik");
		passInput(pom.getInstanceBook().getLastName(),"kumar");
		passInput(pom.getInstanceBook().getBillAddress(),"Salem");
		passInput(pom.getInstanceBook().getCcNum(),"1234123412341234");
		dropdown(pom.getInstanceBook().getType(),"selectbyvalue","VISA");
		dropdown(pom.getInstanceBook().getExpMonth(),"Selectbyvalue","1");
		dropdown(pom.getInstanceBook().getExpYear(),"selectbyvalue","2022");
		passInput(pom.getInstanceBook().getCcNum(),"123");
		clickOnElement(pom.getInstanceBook().bookNow());
		
		driver.close();
		
	}

}
