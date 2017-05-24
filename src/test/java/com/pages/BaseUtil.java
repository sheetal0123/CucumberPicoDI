package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseUtil {

	
	public String picoString;
	public static WebDriver driver;

	public static WebDriver getDriver() {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", path + "/src/test/resources/drivers/geckodriver");
		driver = new FirefoxDriver();
		return driver;
	}
}
