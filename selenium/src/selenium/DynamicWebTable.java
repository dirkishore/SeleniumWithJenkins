package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicWebTable {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver","/home/kishore/Downloads/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/webtables");
		
		driver.findElement(By.xpath("//div[contains(text(),'Cierra' )]/parent::div//preceding-sibling::span[@id='edit-record-1']")).click();
		
		driver.findElement(By.id("firstName")).clear();
		
		driver.findElement(By.id("firstName")).sendKeys("Kishore");
		
		driver.findElement(By.id("lastName")).clear();
		
		driver.findElement(By.id("lastName")).sendKeys("S");
		
		driver.findElement(By.id("userEmail")).clear();
		
		driver.findElement(By.id("userEmail")).sendKeys("kishorekishore2610@gmail.com");
		
		driver.findElement(By.id("age")).clear();
		
		driver.findElement(By.id("age")).sendKeys("19");
		
		driver.findElement(By.id("salary")).clear();
		
		driver.findElement(By.id("salary")).sendKeys("100000");
		
		driver.findElement(By.id("department")).clear();
		
		driver.findElement(By.id("department")).sendKeys("Testing");
		
		driver.findElement(By.id("submit")).click();
	}

}
