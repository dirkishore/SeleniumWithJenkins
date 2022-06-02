package selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadPropFile {

	static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		
		FileInputStream ip = new FileInputStream("/home/kishore/eclipse-workspace/selenium/src/selenium/config.properties");
		
		prop.load(ip);
		
		String browser = prop.getProperty("browser"); 
		
		String url = prop.getProperty("url");
		
		System.out.println(url);
		
		if(browser.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver","/home/kishore/Downloads/chromedriver");
			
			driver = new ChromeDriver();
			
		}
		else if(browser.equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver","/home/kishore/Downloads/geckodriver");
			
			driver = new FirefoxDriver();
			
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(url);
		
		driver.findElement(By.name("email")).sendKeys(prop.getProperty("email"));
		
		driver.findElement(By.name("pass")).sendKeys(prop.getProperty("password"));
		
		driver.findElement(By.name("login")).click();
	}

}
