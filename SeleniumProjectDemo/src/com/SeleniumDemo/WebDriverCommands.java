package com.SeleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium JAR file\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		String url="https://www.facebook.com/";
		
		driver.get(url);
		
		String title=driver.getTitle();
		
		int titleLength=driver.getTitle().length();
		
		System.out.println("Title of the page : "+title);
		System.out.println("Length of the Title : "+titleLength);
		
		String actualUrl=driver.getCurrentUrl();
		
		if(actualUrl.equals(url))
		{
			System.out.println("Verification Successful - The correct Url is opened.....");
		}
		else
		{
			System.out.println("Verification Failed - The incorrect Url is opened.....");
			System.out.println("Actual URL is : "+actualUrl);
			System.out.println("Expected URL is : "+url);
		}

		String pageSource=driver.getPageSource();
		System.out.println("Page Source Length  is : "+pageSource);
		
		int pageSourcelen=driver.getPageSource().length();
		System.out.println("Page Source Length  is : "+pageSourcelen);
		
		driver.close();
	}

}
