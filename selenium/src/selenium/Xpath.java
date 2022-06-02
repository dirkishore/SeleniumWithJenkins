package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "/home/kishore/Downloads/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//input[contains(@id,'twotabsearchtextbox')]")).sendKeys("Iphone 12");
		
		//driver.findElement(By.xpath("//input[start-with(@id,'twotabsearch')]")).sendKeys("Iphone 12");
		//driver.findElement(By.xpath("//input[end-with(@id,'textbox')]")).sendKeys("Iphone 12");
		//driver.findElement(By.xpath("//input[contains(text(),'My Account')]")).sendKeys("Iphone 12");
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(Keys.ENTER);
		
		List <WebElement> linkList = driver.findElements(By.tagName("a"));
		
		System.out.println(linkList.size());
		
		for(int i=0;i<linkList.size();i++) {
			String links = linkList.get(i).getText();
			System.out.println(links);
		}
		
		Thread.sleep(5000);
		
		driver.close();

	}

}
