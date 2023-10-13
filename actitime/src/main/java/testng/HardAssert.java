package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {

	
	@Test
	public void demo() {
		
		String a= "Qspider";
		String b= "spider";
		
		Assert.assertTrue(a.contains(b));
		System.out.println("Control come to next line after string value");
	
	}
	
	@Test
	
	public void demo1() {
		int c = 143;
		int d= 420;
		Assert.assertEquals(c, d);;
		System.out.println("Control come to next line checking int value");
	}

}
