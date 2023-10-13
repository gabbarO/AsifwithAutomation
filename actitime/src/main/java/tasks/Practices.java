package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practices {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		//Nav to the URL
		driver.get("https://www.amazon.in/");
		WebElement paragraph = driver.findElement(By.xpath("//span[contains(text(),'TWEL13107')]/../../../..//span[text()='3,356']"));
		String text = paragraph.getText();
		System.out.println(text);
		}

		
		
	}

