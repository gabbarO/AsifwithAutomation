package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ToGetAttribute {
	public static void main(String[] args) {

		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		WebElement fifthLink = driver.findElement(By.xpath("(//a)[5]"));
		String fifthLinkURL = fifthLink.getAttribute("href");
		System.out.println(fifthLink);
	} 

}
