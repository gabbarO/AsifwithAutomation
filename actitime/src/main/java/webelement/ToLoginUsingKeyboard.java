package webelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLoginUsingKeyboard {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement userTextField = driver.findElement(By.id("username"));
		WebElement passwordTextField = driver.findElement(By.id("pwd"));

		userTextField.sendKeys("trainee");
     	Thread.sleep(2000);
		userTextField.sendKeys(Keys.CONTROL,"a");
		Thread.sleep(2000);
		userTextField.sendKeys(Keys.CONTROL,"c");
		Thread.sleep(2000);
		
		passwordTextField.sendKeys(Keys.CONTROL,"v");
		Thread.sleep(2000);
		passwordTextField.sendKeys(Keys.ENTER);
		
	
	}

}
