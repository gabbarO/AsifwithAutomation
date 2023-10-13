package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToWaitForButtonToBeClick {

	public static void main(String[] args) {


		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
		
		driver.findElement(By.id("email")).sendKeys("yamaniqbal@gmail.com");
		
		WebElement ContinueButton = driver.findElement(By.xpath("//button[@data-continue-to=\"password-container\"]"));
		
		WebDriverWait Wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		Wait.until(ExpectedConditions.elementToBeClickable(ContinueButton));
		
		
		
		ContinueButton.click();
	}

}
