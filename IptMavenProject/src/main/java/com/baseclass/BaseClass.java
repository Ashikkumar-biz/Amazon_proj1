package com.baseclass;

import java.awt.AWTException;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
public static WebDriver driver;
	
//browser launch
	public static WebDriver launchBrowser(String browsername) 
	{
		if (browsername.equalsIgnoreCase("chrome"))
		{
//		System.setProperty("webdriver.chrome.driver",
//				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		else if (browsername.equalsIgnoreCase("firefox")) 
		{
//		System.setProperty("webdriver.gecko.driver",
//				System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
//		driver = new FirefoxDriver();
//		driver.manage().window().maximize();
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}
	
	//URL launch
	public static void getUrl(String url)
	{
		driver.get(url);
	}
	
	//close browser
	public static void closeTab()
	{
		driver.close();
	}
	
	//quit browser
	public static void terminateBrowser()
	{
		driver.quit();
	}
	
	//send keys
	public static void passInput(WebElement element, String keys)
	{
		element.sendKeys(keys);	
	}
	
	//click
	public static void clickOnElement(WebElement element) 
	{
		element.click();
	}
	
	//Navigate to
	public static void navigateTo(String url) 
	{
		driver.navigate().to(url);
	}
	
	//clear
	public static void clear(WebElement element)
	{
		element.clear();
	}
	
	//Navigate back
	public static void back() 
	{
		driver.navigate().back();
	}
	
	//Navigate forward
	public static void forward() 
	{
		driver.navigate().forward();		
	}
	
	//Refresh
	public static void refresh() 
	{
		driver.navigate().refresh();
	}
	
	//Alert
	public static void Alert(String Type, String text) 
	{
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		if (Type.equalsIgnoreCase("accept"))
		{
			alert.accept();
		}
		else if(Type.equalsIgnoreCase("reject"))
		{
			alert.dismiss();
		}
		else if(Type.equalsIgnoreCase("sendKeys"))
		{
			alert.sendKeys(text);
		}
	}
	
	
	//Action (Single actions)
	public static void Actions(WebElement element, String Action) 
	{		
		Actions act = new Actions(driver);
		if(Action.equalsIgnoreCase("click"))
		{
			act.click(element);
		}
		else if(Action.equalsIgnoreCase("RightClick"))
		{
			act.contextClick(element).build().perform();
		}
		else if(Action.equalsIgnoreCase("DoubleClick"))
		{
			act.doubleClick(element);
		}
		else if(Action.equalsIgnoreCase("RightClick"))
		{
			act.contextClick(element).build().perform();
		}
		
	}
	public static void dragAndDrop(String type,WebElement src,WebElement trg,int xoffset, int yoffset)
	{
		Actions act = new Actions(driver);
		if(type.equalsIgnoreCase("draganddrop"))
		{
		act.dragAndDrop(src, trg).perform();
		}
		else if(type.equalsIgnoreCase("movetoelement"))
		{
			act.moveToElement(trg, xoffset, yoffset).perform();
		}
	}
	
	//Frames
	public static void switchFrame(String type, int index, String id, WebElement element) 
	{
		if(type.equalsIgnoreCase("index"))
		{
			driver.switchTo().frame(0);
		}
		else if(type.equalsIgnoreCase("id"))
		{
			driver.switchTo().frame(id);
		}
		else if(type.equalsIgnoreCase("element"))
		{
			driver.switchTo().frame(element);
		}
		else if(type.equalsIgnoreCase("defualt"));
		{
			driver.switchTo().defaultContent();
		}
	}
	
	//Robot
	public static void Robottype(String button) throws AWTException 
	{
		java.awt.Robot rob = new java.awt.Robot();
		char[] charArray = button.toCharArray();
		for (char letter : charArray)
		{
			int keycode = KeyEvent.getExtendedKeyCodeForChar(letter);
			rob.keyPress(keycode);
			rob.keyRelease(keycode);
		}
	}
	
	//Window Handles 
	public static String getWindowHandle() 
	{
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
	}
	public static Set<String> getWindowHandles()
	{
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;
	}
	
	//Dropdown
	public static void dropdown(WebElement element,String type, String value)
	//public static void dropdown(WebElement element,String type, String value,int num) --> This might work
	{
		Select s = new Select(element);
		if (type.equalsIgnoreCase("selectByValue")) 
		{
			s.selectByValue(value);
		}
		else if(type.equalsIgnoreCase("SelectByVisibleText"))
		{
			s.selectByVisibleText(value);
		}
		else if(type.equalsIgnoreCase("SelectByIndex"))
		{
			int index = Integer.parseInt(value);
			s.selectByIndex(index);
		}
	}
	
	//checkbox
	public static void checkbox(WebElement element) 
	{
		element.click();
	}
	
	//is enable
	public static boolean isEnable(WebElement element) 
	{
		boolean enabled = element.isEnabled();
		return enabled;
	}
	
	//is displayed
	public static boolean isDisplayed(WebElement element) 
	{
		boolean displayed = element.isDisplayed();
		return displayed;
	}
	
	//is selected
	public static boolean isSelected(WebElement element)
	{
		boolean selected = element.isSelected();
		return selected;
	}
	
	//Get options
	public static List<WebElement> getOptions(WebElement element) 
	{
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		return options;
		//Refer getselectedoption method to get all text of all the options.
	}
	
	//Get Title
	public static String getTitle() 
	{
		String title = driver.getTitle();
		return title;
	}
	
	//Get current URL
	public static String getCurrentUrl() 
	{
		String url = driver.getCurrentUrl();
		return url;
	}
	
	//Get Text
	public static String getText(WebElement element) 
	{
		String text = element.getText();
		return text;
	}
	
	//Get attribute
	public static String getAttribute(WebElement element, String value) 
	{
		String attribute = element.getAttribute(value);
		return attribute;
	}
	
	//Wait
	public static void wait(WebElement element) throws Throwable 
	{
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	//Take Screenshot
	public static void Screenshot(String filename) throws IOException {
		
		/*
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File trg = new File("C:\\Users\\Ashik kumar\\eclipse-workspace\\Selenium_Task\\Scrnshot\\home.png");
		FileUtils.copyFile(src, trg);
		*/
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File( ".\\Screenshot\\"+filename+".png"));
	}
	
	//scroll up
	public static void scrollUp(int pixels) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String script = String.format("window.scrollBy(0,-%d)", pixels);
		js.executeScript(script);
	}
	
	//scroll down'
	public static void scrolldown(int pixels) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String script = String.format("window.scrollBy(0,%d)", pixels);
		js.executeScript(script);
		js.e
	}
	
	//get first select options
	public static WebElement getFirstSelectedOptions(WebElement element) 
	{
		Select select = new Select(element);
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		return firstSelectedOption;
	}
	
	
	// get all selected options
	public static List<WebElement> getAllSelectedOptions(WebElement element) 
	//To return list of WebElements
	{
		Select select = new Select(element);
		List<WebElement> selectedOptions = select.getAllSelectedOptions();
		return selectedOptions;
	}
	//To return list of strings of the WebELemnts
//	{
//		Select select = new Select(element);
//		List<WebElement> selectedOptions = select.getAllSelectedOptions();
//		List<String> selectedOptionTexts = new ArrayList<String>();
//		for(WebElement option : selectedOptions) 
//		{
//			String text = option.getText();
//			selectedOptionTexts.add(text);
//			//selectedOptionTexts.add(option.getText()); //alternate line
//		}
//		return selectedOptionTexts;
//		
//	}
		
	//is multiple
	public static boolean isMultiple(WebElement element) 
	{
		Select select = new Select(element);
		
		boolean multiple = select.isMultiple();
		return multiple;
	}
	//Radio Button
	public static void radioButton(WebElement element) {
		element.click();
	}
}
