package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetUniqueIDS {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		
		 
		 String windowID1 = driver.getWindowHandle();
		 
		 System.out.println("windowID1");
		 
		 ChromeDriver driver1 = new ChromeDriver();
		 
		 String windowID2 = driver1.getWindowHandle();
		 
		 System.out.println("windowID2");
		 
				 
				 
	}

}
