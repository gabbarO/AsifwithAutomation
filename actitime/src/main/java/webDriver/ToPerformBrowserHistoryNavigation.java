package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformBrowserHistoryNavigation {

	public static void main(String[] args)  {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		
		driver.navigate().to("https://www.facebook.com/");
		driver.navigate().to("https://www.instagram.com/");
		
		driver.navigate().back();
		driver.navigate().forward();
		
		
		
		driver.navigate().refresh();
		
		
		String title = driver.getTitle();
		
		if(title.equals("instagram")) {
			System.out.println("pass: the title is verified");
		}
		
		else
			System.out.println("fail: the title is verified");
	
		

	}

}
