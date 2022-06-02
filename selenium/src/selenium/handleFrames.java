package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class handleFrames {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","/home/kishore/Downloads/geckodriver");
		
		WebDriver driver =  new FirefoxDriver(); //launch the firefox browser
		
		driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		driver.findElement(By.name("email")).sendKeys("9600244824");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.name("password")).sendKeys("online shopping");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		
	}

}
