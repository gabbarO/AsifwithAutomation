//day3
package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Point;

public class ToSetThePosition {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		Point newpos = new Point(400,200);
		driver.manage().window().setPosition(newpos);
     
		
	}

}
