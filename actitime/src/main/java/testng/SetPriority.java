package testng;

import org.testng.annotations.Test;

public class SetPriority {
	
	@Test(priority = 1)
	public void Login() {
		System.out.println("The user logged in");
	}

	@Test(priority = 2)
	public void searchProduct() {
		System.out.println("The product is found ");
	}
	@Test(priority = 3)
	public void addToCart() {
		System.out.println("The product is added ");
	}
	@Test(priority = 4)
	public void payment() {
		System.out.println("The product is paid");
	}
	@Test(priority = 5)
	public void Loggout() {
		System.out.println("The user has Loggout");
	}
}
