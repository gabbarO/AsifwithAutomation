package datadrivenTesting;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToVerifyHomePageTitle {

	public static void main(String[] args) throws IOException, InterruptedException {

		
		FileUtility fUtils = new FileUtility();
		String url = fUtils.toFetchToFetcheDataFromPropertyFile("url");
		
		String username = fUtils.toFetchToFetcheDataFromPropertyFile("username");
		String password = fUtils.toFetchToFetcheDataFromPropertyFile("password");
		
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		Thread.sleep(3000);
		
		
		if(driver.getTitle().contains("Enter")) {
			System.out.println("The Title is verified");
		
		}
		
		else
			System.out.println("the title is not verified");
		
		driver.quit();
		

		
	}

}
