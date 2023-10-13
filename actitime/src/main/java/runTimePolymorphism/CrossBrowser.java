package runTimePolymorphism;

import org.openqa.selenium.WebDriver;

public class CrossBrowser {
	
	public static void test(WebDriver driver) {
		
		driver.manage().window().maximize();
		driver.get("http://instagram.com/");
		
		if(driver.getTitle().equals("Instagram")) {
			System.out.println("Pass: the title is verified");
			
		}
		else
			System.out.println("fail: the title is verified");
		driver.quit();
	}

}
