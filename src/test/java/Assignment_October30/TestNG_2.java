package Assignment_October30;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_2 {
	
public static WebDriver driver;
	
	@BeforeTest
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
	}
		
		@Test(priority=1)
		public void setUp() {
			
		driver.get("https://www.rediff.com/");
		System.out.println(driver.getTitle());
}
	@Test(priority=2)
	public void clickOnSignInButton() {
		driver.findElement(By.xpath("//a[contains(@class,'signin')]")).click();
	}
	
	@Test(priority=3)
	public void enterUserName() {
		driver.findElement(By.xpath("//input[contains(@id,'login1')]")).sendKeys("seleniumpanda@rediffmail.com");
	}
		@Test(priority=4)
		public void enterPasword() {
			driver.findElement(By.xpath("//input[contains(@id,'password')]")).sendKeys("Selenium@123");
			
	}
		@Test(priority=5)
		public void clickOnSignIn() {
		driver.findElement(By.xpath("//input[contains(@class,'signinbtn')]")).click();
		}
		
		@Test(priority=6)
		public void clickOnLogOut() {
		driver.findElement(By.xpath("//a[contains(@class,'rd_logout')]")).click();
}
		@AfterTest
		public void TearDown() {
			driver.quit();
			
		}
}