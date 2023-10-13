package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	
	//2.Constructor
	public LogInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//1. Element identification
	@FindBy(id ="username")
	public WebElement usernameTextField;
	
	@FindBy(name ="pwd")
	public WebElement passwordTextField;
	
	@FindBy(xpath ="//div[text()='Login ']")
	public WebElement loginButton;
	
	//3. Business Logic 
	public void loginAction(String username, String password) {
		usernameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginButton.click();
	}
}
