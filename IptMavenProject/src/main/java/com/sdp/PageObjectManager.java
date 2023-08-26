package com.sdp;

import org.openqa.selenium.WebDriver;

import com.pom.BookHotel_Page;
import com.pom.LoginPage;
import com.pom.SearchHotel_Page;
import com.pom.SelectHotel_Page;

public class PageObjectManager {
	public static WebDriver driver;
	private LoginPage lp;
	private SearchHotel_Page search;
	private SelectHotel_Page select;
	private BookHotel_Page book;
	
	public PageObjectManager(WebDriver driver2) {
		this.driver=driver2;
	
	}
	public LoginPage getInstanceLp() {
		lp = new LoginPage(driver);
		return lp;
	}
	public SearchHotel_Page getInstanceSearch() {
		search = new SearchHotel_Page(driver);
		return search;
	}public SelectHotel_Page getInstanceSelect() {
		select = new SelectHotel_Page(driver);
		return select;
	}public BookHotel_Page getInstanceBook() {
		book = new BookHotel_Page(driver);
		return book;
	}

}
