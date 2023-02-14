package com.MovieFind.util;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserStart {
	static WebDriver driver;

	public static WebDriver browserStart(String name)
	{
		if(name.equalsIgnoreCase("chrome")){
		        driver=new ChromeDriver();
		}
		else if(name.equalsIgnoreCase("firefox")){
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().deleteAllCookies();
		return driver;
		
		
	}
}
