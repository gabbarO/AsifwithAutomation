package tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ToVerifyGoogleImg {

	public static void main(String[] args)  {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		  WebElement altText = driver.findElement(By.xpath("//img[@src=\"https://rukminim2.flixcart.com/image/200/200/kokdci80/dslr-camera/v/e/x/z-24-200mm-z5-nikon-original-imag2zuekuxgxsgg.jpeg?q=70\"]"));
		
		
		System.out.println(altText);
	}
	

}
