package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToMoveToElementUsingCoordinates {

	public static void main(String[] args) {

		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://amp.dev/documentation/examples/interactivity-dynamic-content/star_rating/");
		
		WebElement star1 = driver.findElement(By.id("rating1"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(star1, 213, 0).perform();
		
		

	}

}
