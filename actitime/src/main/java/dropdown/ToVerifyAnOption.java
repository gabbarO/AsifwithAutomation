package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToVerifyAnOption {

	public static void main(String[] args) {
		
		int flag = 1;

		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		
		WebElement yearDropdown = driver.findElement(By.id("year"));
		Select select = new Select(yearDropdown);
		List<WebElement> alloptions = select.getOptions();
		
		 int noofoptions = alloptions.size();
		 
		 System.out.println("The no of options are: "+ noofoptions);
		 
		 for(WebElement option:alloptions) {
			 
			 if(option.getText().equals("1901")) {
				 flag=1;
				 break;
			 }
		 }
		 if(flag==1) {
			 System.out.println("the option is present");
		 }
		 else
			 System.out.println("the option is not present");
		 
		 
		 
	}
}
