package webelement;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ToverifyTheTagName {

	public static void main(String[] args) {

		//launch the browser
		WebDriver driver = new EdgeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//nav to the url
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement element1 = driver.findElement(By.xpath("//nobr[text()='actiTIME 2020 Online']"));
		String leftTextTagName = element1.getTagName();
		
		System.out.println(leftTextTagName);
		
	
		WebElement element2 = driver.findElement(By.linkText("actiTIME Inc."));
		String rightTextTagName = element2.getTagName();
		
		System.out.println(rightTextTagName);
		
		if(leftTextTagName.equals("a")) {
		element1.click();
	 
		}
		else
			System.out.println("The left text is not link");
		if(rightTextTagName.equals("a")) {
			element2.click();
		}
		else
			System.out.println("the right is not link");
		}

		
	}
