package autosuggestion;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToFetchAllSuggestion {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.google.com/");
	
		driver.findElement(By.name("q")).sendKeys("jorden");
		 
		List<WebElement> allsuggestion = driver.findElements(By.xpath("//span[contains(text(),'orden')]"));
		
		for(WebElement suggetion:allsuggestion) {
			System.out.println(suggetion.getText());
		}
	}

}
