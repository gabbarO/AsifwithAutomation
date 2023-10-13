package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToFetchWindowId {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		String windowIDforGoogle = driver.getWindowHandle();
		
		System.out.println(windowIDforGoogle);
		driver.navigate().to("http://facebool.com");
		
	    
		String windowIDForFacebook = driver.getWindowHandle();
		System.out.println("windowIDforFacebook");

	}

}
