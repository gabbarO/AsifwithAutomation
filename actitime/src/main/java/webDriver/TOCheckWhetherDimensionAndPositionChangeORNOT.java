package webDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class TOCheckWhetherDimensionAndPositionChangeORNOT {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		Dimension initialDimension=driver.manage().window().getSize();
		Point initialPoint = driver.manage().window().getPosition();
		
          Dimension newDim = new Dimension(500,900);
          driver.manage().window().setSize(newDim);
          
          Point newPos = new Point(100,115);
          driver.manage().window().setPosition(newPos);
          
          Dimension finalDimension =driver.manage().window().getSize();
          Point finalposition =driver.manage().window().getPosition();
          
          
		if(initialDimension!= finalDimension && initialPoint!=finalposition) {
			System.out.println("Pass The Dimension and The Position has been changed");
		}
		else
			System.out.println("Fail: the dimension and position has not been changed");
		
	
	}

}
