package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;


public class new_window_demo {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","/home/kishore/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/text-box");
		
		driver.switchTo().newWindow(WindowType.TAB);

		driver.get("www.google.com");
	}
}
