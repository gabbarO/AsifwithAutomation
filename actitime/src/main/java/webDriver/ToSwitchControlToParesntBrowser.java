package webDriver;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchControlToParesntBrowser {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		String parentWindowID = driver.getWindowHandle();
		
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.navigate().to("http://www.facebook.com");
		
		driver.switchTo().window(parentWindowID);
		
		String title = driver.getTitle();
		
		System.out.println(title);
	}

}
