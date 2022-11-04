package October_30;

import org.testng.annotations.Test;

public class priority_Avalue {
	
	@Test (priority=2)
	public void tc1(){
		System.out.println(" test case 1");
	}
	@Test (priority=3)
	public void tc2(){
		System.out.println(" test case 2");
	}
	@Test(priority=1)
	public void tc3(){
		System.out.println(" test case 3");
	}
	@Test(priority=5, enabled=false)
	public void tc4(){
		System.out.println(" test case 4");
	}
	@Test(priority=4, invocationCount=5)
	public void tc5(){
		System.out.println(" test case 5");
	}
	
	}


