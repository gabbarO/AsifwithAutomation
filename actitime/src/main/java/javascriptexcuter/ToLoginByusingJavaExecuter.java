package javascriptexcuter;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ToLoginByusingJavaExecuter {

	public static void main(String[] args) {
		

		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement Button = driver.findElement(By.id("loginButton"));
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
        //Perform Click on LOGIN button using JavascriptExecutor		

		JavascriptExecutor js = (JavascriptExecutor)driver;		

		js.executeScript("arguments[0].click()",Button);

	}

}
