package javascriptexcuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToSendValues {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		WebElement disabledTextField = driver.findElement(By.xpath("//input[@class='form-control']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='Qspiders'",disabledTextField );
	}

}
