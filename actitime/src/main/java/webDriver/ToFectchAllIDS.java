package webDriver;

import java.util.Set;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFectchAllIDS {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("http://www.facebook.com");
		
		 Set<String> allIDs = driver.getWindowHandles();
		
		System.out.println(allIDs);
		
		for( String id:allIDs) {
			System.out.println(id);
		}

	}

}
