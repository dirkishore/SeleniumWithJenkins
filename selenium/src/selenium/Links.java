package selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/home/kishore/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/links");
		
		driver.findElement(By.xpath("//a[@id='simpleLink']")).click();
		
		driver.navigate().back();

	}

}