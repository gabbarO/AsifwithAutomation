package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ToSwitchIntoMap {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
	
	     driver.findElement(By.xpath("//a[@aria-label=\"Google apps\"]")).click();

	        
	    driver.switchTo().frame("app");
	    
	    driver.findElement(By.xpath("//span[text()='Maps']")).click();
	    WebElement searchbox = driver.findElement(By.id("searchboxinput"));
	    
	    searchbox.sendKeys("Noida");
	    searchbox.sendKeys(Keys.ENTER);
	    
	    if(driver.getPageSource().contains("Noida")) {
	    System.out.println("pass : the location is verified");
	}
	    else
	    	System.out.println("fail : the location is verified");
	
	}

}
