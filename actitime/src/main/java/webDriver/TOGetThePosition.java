package webDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class TOGetThePosition {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		
		Point position = driver.manage().window().getPosition();
		System.out.println(position);
		
		int YCoordinate = position.getX();
		int XCoordinate = position.getY();
		
		System.out.println("The x coordinate:"+XCoordinate);
		System.out.println("The Y coordinate:"+YCoordinate);

		

	}

}
