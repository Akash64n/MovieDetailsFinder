package com.MovieFind.pagemodels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WikiSearch {
	
	
	
    	public static String wikiMovieDetails(WebDriver driver,String movie) throws InterruptedException {
    		
    		    driver.get("https://en.wikipedia.org/");
    			WebElement search=driver.findElement(By.name("search"));
    			search.clear();
    			search.sendKeys(movie);
    			driver.findElement(By.xpath("//button[contains(@class,'cdx-search-input')]")).click();
    					
    			Thread.sleep(5000);
    			WebElement releaseDate=driver.findElement(By.xpath("//table[@class='infobox vevent']"
    												+ "//div[text()='Release date']/../following-sibling::td//div//li"));
    			
    			String date=releaseDate.getText();

    			WebElement Country=driver.findElement(By.xpath("//table[@class='infobox vevent']//th[text()='Country']"
    												+ "//following-sibling::td"));

    			String count=Country.getText();
				return count+":"+date;   		
    		
    	}
	
	
	  

}
