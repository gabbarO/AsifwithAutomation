package webDriver;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseCurrentBowser {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.navigate().to("https://www.facebook.com/");
		
		driver.quit();
		
	}

}
