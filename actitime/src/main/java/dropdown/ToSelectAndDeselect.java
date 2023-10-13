package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToSelectAndDeselect {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demoqa.com/select-menu");
		
		WebElement cardropdown = driver.findElement(By.id("cars"));
		
		Select select = new Select(cardropdown);

		select.selectByVisibleText("Audi");
		select.selectByVisibleText("Volvo");
		select.selectByVisibleText("Opel");
		
		select.deselectByIndex(3);
		Thread.sleep(2000);
		
		select.deselectByValue("Opel");
		Thread.sleep(2000);
		select.deselectByVisibleText("Volvo");
		

	}

}
