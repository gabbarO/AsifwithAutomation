package popup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FileDownloadPopUp {

	public static void main(String[] args) throws AWTException {


		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demo.imacros.net/Automate/Downloads");
		
		driver.findElement(By.linkText("Download")).click();
		
		//robot will be use when download setting is disable.
		//Robot robot= new Robot();
		//robot.keyPress(KeyEvent.VK_ENTER);
		
	}

}
