package runTimePolymorphism;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {

	public static void main(String[] args) {
		
		CrossBrowser.test(new ChromeDriver());
		System.out.println("The application is tested in chrome Browser");
		
		CrossBrowser.test(new EdgeDriver());
		System.out.println("The application is tested in Edge Browser");
		 
		CrossBrowser.test(new FirefoxDriver());
		System.out.println("The application is tested in firefox driver");
		

	}

}
