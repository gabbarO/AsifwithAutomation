package popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FileUploadpopUp {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://fineuploader.com/demos.html");
		
		driver.findElement(By.name("qqfile")).sendKeys("C:\\Users\\USER\\Downloads\\New-file (1).gif");
		
	}

}
