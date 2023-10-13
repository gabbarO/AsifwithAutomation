package popup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class IgnoreNotificationPopUp {

	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.yatra.com/");
		
	}

}
