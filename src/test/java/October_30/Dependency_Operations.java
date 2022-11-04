package October_30;

import org.testng.annotations.Test;

public class Dependency_Operations {

	@Test()
	public void tc1(){
		System.out.println(" test case 1");
	}
	
	@Test(dependsOnMethods="tc1")
	public void tc2(){
		System.out.println(" test case 2");
	}
	
	@Test(dependsOnMethods={"tc1","tc2"})
	public void tc3(){
		System.out.println(" test case 3");
	}
	
	@Test(dependsOnMethods={"tc1","tc2","tc3"})
	public void tc4(){
		System.out.println(" test case 4");
	}
	
	@Test(dependsOnMethods={"tc1","tc2","tc3","tc4"})
	public void tc5(){
		System.out.println(" test case 5");
	}
	
	}




