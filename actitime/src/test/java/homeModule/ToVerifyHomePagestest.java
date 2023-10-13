package homeModule;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericutils.BaseClass;
import pom.HomePage;
import pom.LogInPage;

public class ToVerifyHomePagestest extends BaseClass {
	
	
	@Test

	public  void ToVerifyHomePagestest() throws IOException {
		String expectedHomePageTitle = futils.fetchStringDataFromExcelSheet("Sheet2", 3, 0);

	
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleContains(expectedHomePageTitle));
		
		String actualhomePageTitle =driver.getTitle();
		
		Assert.assertTrue(actualhomePageTitle.contains(expectedHomePageTitle));
		System.out.println("pass: title is verified");
		
	}

	
		
	
}


