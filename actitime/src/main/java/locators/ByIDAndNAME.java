package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ByIDAndNAME {

	public static void main(String[] args) {

		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/USER/Desktop/asif.html");
		
		  WebElement IdInput = driver.findElement(By.id("123abc"));
		   IdInput.sendKeys("Asif iqbal");
		   
		   WebElement pwd = driver.findElement(By.id("asif@0988"));
		   pwd.sendKeys("khan@1234");
			//driver.findElement(By.className("male")).click() ;

		   
	}

}
