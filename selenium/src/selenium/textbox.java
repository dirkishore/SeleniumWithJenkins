package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class textbox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/home/kishore/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/text-box");
		
		driver.findElement(By.id("userName")).sendKeys("Kishore");
		
		driver.findElement(By.id("userEmail")).sendKeys("kishorekishore2610@gamil.com");
		
		driver.findElement(By.id("currentAddress")).sendKeys("coimbatore");
		
		driver.findElement(By.id("permanentAddress")).sendKeys("coimbatore");
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	}

}
