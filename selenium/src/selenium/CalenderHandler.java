package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderHandler {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/home/kishore/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		//driver.findElement(By.xpath("//div[@class='react-datepicker__month-container']//descendant::div[@class='react-datepicker__month-dropdown-container react-datepicker__month-dropdown-container--select']")).click();
		
		//div[@class='react-datepicker__month-container']//descendant::div[@class='react-datepicker__month-dropdown-container react-datepicker__month-dropdown-container--select']

		Select select = new Select(driver.findElement(By.xpath("//div[@class='react-datepicker__month-container']//descendant::div[@class='react-datepicker__month-dropdown-container react-datepicker__month-dropdown-container--select']")));
		select.selectByVisibleText("October");
	}

}
