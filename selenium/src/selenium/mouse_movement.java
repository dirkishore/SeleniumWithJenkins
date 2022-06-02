package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouse_movement {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/home/kishore/Downloads/chromedriver");
		
		WebDriver driver =  new ChromeDriver(); 
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://jqueryui.com/demos/");
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.className("dropdown"))).build().perform();

		driver.findElement(By.linkText("Code")).click();
		
		//By.xpath("//input[@class='value']")
		//By.xpath("//input[contains(@class,'value')]")
		//By.xpath("//input[contains(@id,'value')]")
		//By.xpath("//input[starts-with(@id,'value')]")
	}

}
