package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToDoubleClick {

	public static void main(String[] args) {

		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
		
		WebElement plusbutton = driver.findElement(By.xpath("//i[@class=\"fa fa-plus\"]"));
		

		Actions action=new Actions(driver);
		action.doubleClick(plusbutton).perform();
		action.doubleClick(plusbutton).perform();
		action.doubleClick(plusbutton).perform();
		
	}

}
