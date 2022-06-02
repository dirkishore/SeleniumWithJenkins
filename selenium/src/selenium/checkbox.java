package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","/home/kishore/Downloads/geckodriver");
		
		WebDriver driver =  new FirefoxDriver(); //launch the firefox browser
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/checkbox");
		
		//driver.findElement(By.className("rct-title")).click();
		
		//driver.findElement(By.className("rct-text")).click();
		driver.findElement(By.className("rct-title")).click();
		//driver.findElement(By.className("rct-title")).click();
	}

}
