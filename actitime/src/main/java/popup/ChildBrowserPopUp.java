package popup;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class ChildBrowserPopUp {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.google.com/");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.facebook.com/");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.instagram.com/");
		
		Set<String> allIds = driver.getWindowHandles();
		
		for(String id:allIds) {
			driver.switchTo().window(id);
			
		}
		
		
		
	}

}
