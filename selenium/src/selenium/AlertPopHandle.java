package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertPopHandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","/home/kishore/Downloads/geckodriver");
		
		WebDriver driver =  new FirefoxDriver(); //launch the firefox browser
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		
		//how to handle alerts important interview question
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		String textmsg =  alert.getText();
		
		if (textmsg.equals("Please enter a valid user name")) {
			System.out.println("Correct");
		}
		else {
			System.out.println("In Correct");
		}
		
		alert.accept();
		
		driver.close();
		
	}

}
