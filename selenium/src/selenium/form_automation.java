package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class form_automation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/kishore/Downloads/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().window().maximize();

		driver.get("https://demoqa.com/automation-practice-form");

		driver.findElement(By.id("firstName")).sendKeys("Kishore");

		driver.findElement(By.id("lastName")).sendKeys("S");

		driver.findElement(By.id("userEmail")).sendKeys("kishorekishore2610@gmail.com");

		driver.findElement(By.className("custom-control-label")).click();

		driver.findElement(By.id("userNumber")).sendKeys("8472829198");

		driver.findElement(By.className("form-control")).sendKeys(Keys.CLEAR);
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("dateOfBirthInput")).sendKeys("26 Oct 2002");


	}

}
