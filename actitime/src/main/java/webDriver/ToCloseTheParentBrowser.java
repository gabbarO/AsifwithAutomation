package webDriver;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class ToCloseTheParentBrowser {

	public static void main(String[] args) {


		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		String parentWindowID = driver.getWindowHandle();
		
		 driver.switchTo().newWindow(WindowType.TAB);
		 
		 driver.navigate().to("https://www.whatsapp.com/");
		 
			driver.switchTo().window(parentWindowID);
			driver.close();	 
		
	}

}
