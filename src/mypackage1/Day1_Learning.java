package mypackage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1_Learning {

	public static void main(String[] args) {
	    
		System.setProperty("webdriver.chrome.driver","F:\\Selenium files\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
	    	
	        String url = "https://www.facebook.com";
	        String expectedTitle = "fb	";
	        String actualTitle = "fb";

	        driver.getTitle();
	        driver.get(url);

	 

	      
	        if (actualTitle.contentEquals(expectedTitle)){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
	       
	    
	        driver.close();
	       
	    }

	

	}


