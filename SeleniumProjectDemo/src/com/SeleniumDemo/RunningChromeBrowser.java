package com.SeleniumDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunningChromeBrowser {

	public static void main(String[] args) {
		// System Property for Chrome Driver
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium JAR file\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		
		// Instantiate a ChromeDriver class
		WebDriver driver=new ChromeDriver();
		
		// Launch Website
		driver.get("http://www.javatpoint.com/");
		
		//Maximize the browser
		driver.manage().window().maximize();
		
		//Scroll down the webpage by 5000 pixels
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,5000)");
		
		//Click on the Search Button
		driver.findElement(By.linkText(" Java")).click();		

	}

}
