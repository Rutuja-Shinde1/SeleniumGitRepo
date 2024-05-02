package com.SeleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium JAR file\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");

		WebDriver driver=new ChromeDriver(); //Creating object of WebDriver Interface.

		driver.manage().window().maximize();

		driver.get("https://www.google.com/");
		System.out.println("Hello");

		driver.close();

	}

}
