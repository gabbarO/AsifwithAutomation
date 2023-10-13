package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTheURl {

	public static void main(String[] args) {
		
		String expectedURl = "http://www.instagram.com/";
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.instagram.com/");
		
		 String actualURL = driver.getCurrentUrl();
		 
		System.out.println("The acutal url is : "+actualURL);
		System.out.println("The acutal url is : "+expectedURl);
		
		if(actualURL.equals(expectedURl)) {
			
			System.out.println("Pass: the URL is verified");
		}
		else
			System.out.println("Fail: the URL is not verified");

		
	
		
	}

}
