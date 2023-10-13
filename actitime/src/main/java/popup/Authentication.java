package popup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Authentication {

	public static void main(String[] args) {
		
		String username="admin";
		String password="admin";


		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//http://admin:admin@the-internet.herokuapp.com/basic_auth
		
		driver.get("http://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth");
		
		
	}

}
