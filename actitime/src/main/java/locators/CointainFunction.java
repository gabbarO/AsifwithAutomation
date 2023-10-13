package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CointainFunction {

	public static void main(String[] args) {
//1.launch the browser
		WebDriver driver = new ChromeDriver();
		// maximize the window
		driver.manage().window().maximize();
		//Nav to the URL
		driver.get("https://www.selenium.dev/");
		
		WebElement paragraph = driver.findElement(By.xpath("//p[contains(text(),'If you want to create robust, browser-based regression automation suites and tests')]"));
		String text = paragraph.getText();
		System.out.println(text);
		if(text.contains("If you want to create")) {
			System.out.println("Pass: the text is present");
		}
		else
			System.out.println("fail: the text is not present");
		}
		
		

		
	
	
	}
