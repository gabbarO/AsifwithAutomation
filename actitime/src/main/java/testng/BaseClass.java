package testng;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import datadrivenTesting.FileUtility;
import pom.HomePage;
import pom.LogInPage;

public class BaseClass {
	
	public WebDriver driver;
	
	public FileUtility futils = new FileUtility();

	
	@BeforeSuite
	public void bu() {
		System.out.println("data base is established");
	}
	@BeforeTest
	public void bt() {
		System.out.println("Parralel Excution started");
	}
	@BeforeClass
	public void bc() throws IOException {
		String URl = futils.toFetchToFetcheDataFromPropertyFile("url");

		driver = new EdgeDriver();
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		System.out.println("Launch the browser");
		
		driver.get(URl);
		
		System.out.println("Navigate to the URL");

	}
	@BeforeMethod
	public void bm() throws IOException {
		
		 String username = futils.toFetchToFetcheDataFromPropertyFile("username");
		 String password = futils.toFetchToFetcheDataFromPropertyFile("password");
		 LogInPage login = new LogInPage(driver);
		 login.loginAction(username, password);

		 System.out.println("Login to the Application");
	}
		
	@AfterMethod
	public void am() {
		HomePage homePage = new HomePage(driver);
		homePage.logoutAction();
		System.out.println("Logout from the applicaton");
	}
	
	@AfterClass
	public void ac() {
		
		driver.quit();
		
		System.out.println("Close the browser");
	}
	
	@AfterTest
	public void at() {
		System.out.println("Parrallel Execution stopped");
	}
	
	@AfterSuite
	public void as() {
		System.out.println("data base connection is stoped");
	}


}
 
