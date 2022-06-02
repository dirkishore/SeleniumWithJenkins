package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementVisibilityTest {

	public static void main(String[] args) {

		//isDisplay() whether the element is visible or not
		//isEnable()  whether clickable or not (terms and conditions submit)
		//isSelected() is selected or not? (button,radio button,check box)
		
		System.setProperty("webdriver.gecko.driver","/home/kishore/Downloads/geckodriver");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://api.freecrm.com/register/");
		
		boolean b1 = driver.findElement(By.name("terms")).isSelected(); //false
		
		System.out.println(b1);
		
		driver.findElement(By.name("terms")).click();
		
		boolean b2 = driver.findElement(By.name("terms")).isSelected(); //true
		
		System.out.println(b2);
		
		boolean b3 = driver.findElement(By.name("action")).isEnabled();//true
		
		System.out.println(b3);
		
		boolean b4= driver.findElement(By.name("action")).isDisplayed();//true
		
		System.out.println(b4);
		
		
	}

}
