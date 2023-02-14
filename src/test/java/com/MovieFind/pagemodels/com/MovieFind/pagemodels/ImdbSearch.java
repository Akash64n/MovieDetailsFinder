package com.MovieFind.pagemodels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ImdbSearch {

	public static String imdbMovieDetails(WebDriver driver,String movie) throws InterruptedException {
		
		driver.get("https://www.imdb.com/");
		WebElement search=driver.findElement(By.name("q"));
		search.clear();
		search.sendKeys(movie);
		driver.findElement(By.xpath("//button[contains(@class,'nav-search')]")).click();
		driver.findElement(By.xpath("//section[@data-testid='find-results-section-title']//ul/li[1]//a")).click();
		
		Thread.sleep(5000);
		WebElement releaseDate=driver.findElement(By.xpath("//a[text()='Release date']/../div//a"));
		String date=releaseDate.getText();
		
		WebElement country=driver.findElement(By.xpath("//button[text()='Country of origin']/..//a"));
		String count=country.getText();

		return count+":"+date;	
	
}
	
}
