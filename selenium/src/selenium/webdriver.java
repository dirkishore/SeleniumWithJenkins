package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webdriver {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","/home/kishore/Downloads/geckodriver");
		
		WebDriver driver =  new FirefoxDriver(); //launch the firefox browser
		
		driver.navigate().to("https://www.google.com");
	    
		String title = driver.getTitle();
		
		System.out.println(title);
		
		//checking the title of the website
		if(title.equals("Google")) {
			System.out.println("Correct title");
		}
		else {
			System.out.println("In correct");
		}
		
		//get current url
		System.out.println(driver.getCurrentUrl());
		
		driver.close();//close the browser
		
		
	}

}
