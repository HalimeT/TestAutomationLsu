package com.Lsu.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public static WebDriver driver;
	@BeforeMethod(alwaysRun=true)
	public static void setUp() {
		
		String browser=ConfigReader.getProperty("browser");
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", Constants.WEB_DRIVER_PATH_CHROME);
			driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", Constants.WEB_DRIVER_PATH_FIREFOX);
			driver=new FirefoxDriver();
		}else {
			System.err.println("Please pass the right browser!");
		}
		driver.get(ConfigReader.getProperty("url"));
	}
	@AfterMethod()
	public static void tearDown() {
		driver.close();
	}

}
