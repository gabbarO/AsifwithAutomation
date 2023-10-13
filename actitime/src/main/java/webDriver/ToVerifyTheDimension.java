package webDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

    public class ToVerifyTheDimension {

	public static void main(String[] args) {
		
	 
		ChromeDriver driver = new ChromeDriver();
		
		Dimension dimension = driver.manage().window().getSize();
		
		int width = dimension.getWidth();
		int height= dimension.getHeight();
		//driver.manage().window().fullscreen();
		System.out.println("the height is:"+height);
		System.out.println("the width is:"+width);
             


		

	}

}