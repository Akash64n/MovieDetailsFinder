package com.MovieFind.Test;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.MovieFind.pagemodels.WikiSearch;
import com.MovieFind.util.BrowserStart;


public class WikiTest extends WikiSearch {
	WebDriver driver;
	  @BeforeMethod
	  public void setup() {
		 driver=BrowserStart.browserStart("chrome");
	  }
	  
	  @Test
	  public void wikiMovieDetailsTest() throws InterruptedException {
		   String movieName="Pushpa";
		   String details=WikiSearch.wikiMovieDetails(driver,movieName);
		   String[] wikiDetails = details.split(":");
		   String Country=wikiDetails[0];
		   String Date=wikiDetails[1];;
			
		   assertEquals(Country,"India");
		   assertEquals(Date,"17 December 2021");   
	  }
	
	  @AfterMethod
	  public void tearDown() {
		  driver.quit();
	  }

	
}
