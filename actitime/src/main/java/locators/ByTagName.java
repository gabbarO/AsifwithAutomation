package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByTagName {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/USER/Desktop/asif.html");
		
		 WebElement header = driver.findElement(By.tagName("h1"));
		 
		 String headertext = header.getText();
		 
		 System.out.println(headertext);
		 
		 if(headertext.contains("selenium")) {
			 System.out.println("Pass: the header has selenium");
		 }
		 else
			 System.out.println("fail: the header do not have selenium");
		
			 
			 
		 }
	}

