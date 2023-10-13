package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/USER/Desktop/Xml.html");
		
		driver.findElement(By.xpath("html/body/div[1]/input[2]")).sendKeys("wowww");
	}

}
