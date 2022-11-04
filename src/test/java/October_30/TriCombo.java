package October_30;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TriCombo {
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is Before Method Annotation");
	}
	@Test
	public void testcase1() {
		System.out.println("This is my first test case");
	}
	
	@Test
	public void testcase2() {
		System.out.println("This is my second test case");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("This is After Method Annotation");
	
	}
	

}
