package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ClassB {
	

	@Test
	public void a() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
	}

	

}
