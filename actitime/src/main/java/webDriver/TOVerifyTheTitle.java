package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class TOVerifyTheTitle {

	public static void main(String[] args) {
		String expectedTitle= "Facebook - Log in or sign up";
		
	    ChromeDriver driver =new ChromeDriver();
	    
	    driver.get("http://www.Facebook.com/");
	    
	    driver.get("http://www.Facebook.com/");
	    
	    String actualTitle = driver.getTitle();
	    
	    System.out.println("The actual Title is: "+actualTitle);
	    System.out.println("The expected Title is :"+expectedTitle);
	    
	    if(actualTitle.equals(expectedTitle)) {
	    	System.out.println("Pass : the title is verified");
	    	
	    }
	    else
	    	System.out.println("Fail : the title is not verified");
	    
}
	    	
		
		

	}


