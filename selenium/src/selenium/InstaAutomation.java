package selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class InstaAutomation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/home/kishore/Downloads/chromedriver");
		
		ChromeOptions option = new ChromeOptions();
		
		option.addArguments("disable-notifications");
		
		WebDriver driver =  new ChromeDriver(option); //launch the firefox browser
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.instagram.com/");
		
		driver.findElement(By.className("KPnG0")).click();
		
		driver.findElement(By.name("email")).sendKeys("8428534198");
		
		driver.findElement(By.name("pass")).sendKeys("smkishore");
		
		driver.findElement(By.name("login")).click();
		
		//driver.findElement(By.className("aOOlW   HoLwm ")).click();
	
		driver.findElement(By.xpath("//svg[@class='_8-yf5 ']")).click();
		
		driver.findElement(By.className("             qF0y9          Igw0E   rBNOH        eGOV_     ybXk5    _4EzTm                                                                                                              ")).click();
		
		driver.findElement(By.className("             qF0y9          Igw0E     IwRSH      eGOV_        vwCYk                                        ItkAi                                                                       ")).sendKeys("hi");
		
		
	}

}
