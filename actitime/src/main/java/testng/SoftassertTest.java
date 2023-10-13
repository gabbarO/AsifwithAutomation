package testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftassertTest {
	
	
	@Test
	public void demoAssertion1() {
		
		String a = "Qspider";
		String b = "Jspider";
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(a, b);
		System.out.println("Line Before Assertion for demo1");
		sa.assertAll();
		System.out.println("Line after Assertion for demo1");

	}
	
	@Test
	public void demoAssertion2() {
		
		int a = 420;
		int b = 120;
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(a, b);
		System.out.println("Line Before Assertion for demo2");
		sa.assertAll();
		System.out.println("Line after Assertion for demo2");

	}
	
	@Test
	public void demoAssertion3() {
		
		boolean a = true;
		boolean b = false;
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(a, b);
		System.out.println("Line Before Assertion for demo3");
		sa.assertAll();
		System.out.println("Line after Assertion for demo3");

	}

}
