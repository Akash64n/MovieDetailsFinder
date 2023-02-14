package com.MovieFind.Test;


import org.testng.annotations.Test;


import com.MovieFind.pagemodels.ImdbSearch;
import com.MovieFind.util.BrowserStart;

import org.testng.annotations.BeforeMethod;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class ImdbTest extends ImdbSearch {
	WebDriver driver;
	  @BeforeMethod
	  public void setup() {
		 driver=BrowserStart.browserStart("chrome");
	  }
	  
	  @Test
	  public void imdbMovieDetailsTest() throws InterruptedException {
		   String movieName="Pushpa";
		   String details=ImdbSearch.imdbMovieDetails(driver, movieName);
		   String[] wikiDetails = details.split(":");
		   String Country=wikiDetails[0];
		   String Date=wikiDetails[1];;
		   
		   assertEquals(Country,"India");
		   assertEquals(Date, "December 17, 2021 (United States)");		
	  }
	
	  @AfterMethod
	  public void tearDown() {
		  driver.quit();
	  }
}
