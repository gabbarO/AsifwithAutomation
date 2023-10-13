package webDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.*;


public class ToSetSize {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		
		Dimension dim = new Dimension(500,300);
		driver.manage().window().setSize(dim);
		
		

	}

}
