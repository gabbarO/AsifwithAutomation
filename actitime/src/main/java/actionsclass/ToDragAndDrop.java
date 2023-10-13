package actionsclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToDragAndDrop {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		
	    driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement oslo = driver.findElement(By.id("box1"));
		WebElement norway = driver.findElement(By.id("box101"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(oslo, norway).perform();
		
		WebElement Stockholm = driver.findElement(By.id("box2"));
		WebElement sweden = driver.findElement(By.id("box102"));
		
		Actions action1 = new Actions(driver);
		action.dragAndDrop(Stockholm, sweden).perform();
		
		WebElement Washington  = driver.findElement(By.id("box3"));
		WebElement UnitedStates = driver.findElement(By.id("box103"));
		
		Actions action2 = new Actions(driver);
		action.dragAndDrop(Washington, UnitedStates).perform();
		
		
		WebElement Copenhagen  = driver.findElement(By.id("box4"));
		WebElement Denmark = driver.findElement(By.id("box104"));
		
		Actions action3 = new Actions(driver);
		action.dragAndDrop(Copenhagen, Denmark).perform();

		WebElement Madrid  = driver.findElement(By.id("box7"));
		WebElement Spain = driver.findElement(By.id("box107"));
		
		Actions action4 = new Actions(driver);
		action.dragAndDrop(Madrid, Spain).perform();

		
		WebElement rome  = driver.findElement(By.id("box6"));
		WebElement Italy = driver.findElement(By.id("box106"));
		
		Actions action5 = new Actions(driver);
		action.dragAndDrop(rome, Italy).perform();

		
		WebElement Seoul = driver.findElement(By.id("box5"));
		WebElement SouthKorea = driver.findElement(By.id("box105"));
		
		Actions action6 = new Actions(driver);
		action.dragAndDrop(Seoul, SouthKorea).perform();





	
	}

}
