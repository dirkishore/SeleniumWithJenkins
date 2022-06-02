package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ratio_button {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","/home/kishore/Downloads/geckodriver");
		
		WebDriver driver =  new FirefoxDriver(); //launch the firefox browser
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/radio-button");
		
		//click yes
		driver.findElement(By.className("custom-control-label")).click();
		
		String text = driver.findElement(By.className("mt-3")).getText();
		
		System.out.println(text);
		if(text.equals("You have selected Yes")) {
			System.out.println("Correct");
		}
		else {
			System.out.println("In correct");
		}
		
		Thread.sleep(3000);
		
		driver.findElement(By.className("custom-control-label")).click();
		
		String text2 = driver.findElement(By.className("mt-3")).getText();
		
		System.out.println(text2);
	}

}
