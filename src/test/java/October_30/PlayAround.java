package October_30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PlayAround {
	public static WebDriver driver;
	
	@BeforeTest
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	@Test
	
	public void setUp() {
		System.out.println("Hello Java");
		driver.get("https://www.rediff.com/");
		System.out.println("The title of the page is:" +driver.getTitle());
	}
	@Test 
	public void clickOnSignInLink() {
		driver.findElement(By.xpath("//a[@class='signin']")).click();
		
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
