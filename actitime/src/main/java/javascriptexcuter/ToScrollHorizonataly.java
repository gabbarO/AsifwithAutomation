package javascriptexcuter;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToScrollHorizonataly {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.kwokyinmak.com/");
		Thread.sleep(2000);

		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(2000,0)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(5000,0)");

	}

}
