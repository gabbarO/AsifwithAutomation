package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyOverlappingOrNot {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/USER/Desktop/asif.html");
		
		WebElement username = driver.findElement(By.id("somthing"));
		WebElement password = driver.findElement(By.id("somthingelse"));
		
		
		

	}

}
