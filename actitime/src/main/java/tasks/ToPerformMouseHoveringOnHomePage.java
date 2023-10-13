package tasks;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformMouseHoveringOnHomePage {

	public static void main(String[] args) {

		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.myntra.com/");
		
		WebElement maindesktop = driver.findElement(By.xpath("//a[@class=\"desktop-main\"]"));
        Actions action=new Actions(driver);
		action.moveToElement(maindesktop).perform();
		
		WebElement men = driver.findElement(By.xpath("//a[@data-group=\"men\"]"));
		Actions actions = new Actions(driver);
		action.moveToElement(men).perform();
		
		WebElement women = driver.findElement(By.xpath("//a[@data-group=\"women\"]"));
		Actions actions2 = new Actions(driver);
		action.moveToElement(women).perform();
		
		WebElement Kids = driver.findElement(By.xpath("//a[@data-group=\"kids\"]"));
		Actions actions3 = new Actions(driver);
		action.moveToElement(Kids).perform();
		
		WebElement HomeANDLiving = driver.findElement(By.xpath("//a[@data-group=\"home-&-living\"]"));
		Actions actions4 = new Actions(driver);
		action.moveToElement(HomeANDLiving).perform();
		
		WebElement beauty = driver.findElement(By.xpath("//a[@data-group=\"beauty\"]"));
		Actions actions5 = new Actions(driver);
		action.moveToElement(beauty).perform();
		

		
		WebElement studio = driver.findElement(By.xpath("//a[@data-group=\"studio\"]"));
		Actions actions6 = new Actions(driver);
		action.moveToElement(studio).perform();
		
		
		


		}
	}

