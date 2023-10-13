package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToVerifySelectedOption {

	public static void main(String[] args) {


		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://demoqa.com/select-menu");
		
		WebElement cardropdown = driver.findElement(By.id("cars"));
		
		Select select = new Select(cardropdown);

		select.selectByVisibleText("Audi");
		select.selectByVisibleText("Volvo");
		select.selectByVisibleText("Opel");
		
		List<WebElement> selectoptions = select.getAllSelectedOptions();
		
		int noofselectoptions = selectoptions.size();
		
		System.out.println("The no of selected option are:"+noofselectoptions);
		
		for(WebElement option:selectoptions) {
		System.out.println(option.getText());
		}
		
		
		WebElement firstselectedElement = select.getFirstSelectedOption();
		
		String FirstSelectedOption = firstselectedElement.getText();
		System.out.println("The First selected option is "+FirstSelectedOption);
		

	
	}

}
