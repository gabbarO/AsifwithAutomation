package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyCountryNameIsPresentOrNot {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http:google.co.in/");
		
		String sourceCode = driver.getPageSource();
		
		if(sourceCode.contains("India")) {
		
			System.out.println("Pass: The Country name is present");
		}

		else
			System.out.println("FAil: the country name is not present");
	}

}
