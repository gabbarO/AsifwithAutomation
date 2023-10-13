package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLeftClick {

	public static void main(String[] args) {

		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demo.actitime.com/login.do");
		
		WebElement Checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
		
		Actions action =new  Actions(driver);
		action.click(Checkbox).perform();
		

	}

}
