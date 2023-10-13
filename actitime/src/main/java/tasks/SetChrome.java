package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SetChrome {

	public static void main(String[] args) {
		
		ChromeOptions co = new ChromeOptions();
		co.setBrowserVersion("114");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("q")).sendKeys("Chrome");
		System.out.println(driver.getTitle());
	}

}
