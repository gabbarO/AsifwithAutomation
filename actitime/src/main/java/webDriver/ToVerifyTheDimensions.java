package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class ToVerifyTheDimensions {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.manage().window().minimize();
		driver.manage().window().fullscreen();
		
		

	}

}
