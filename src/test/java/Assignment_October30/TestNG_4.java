package Assignment_October30;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_4 {

	public static WebDriver driver;
	
	@BeforeTest
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
	@Test(priority=1)
	public void setUp() {
		driver.get("https://www.costco.com/");
		System.out.println(driver.getTitle());
	}
	
	@Test(priority=2)
	public void clickOnSingInRegister(){
		driver.findElement(By.xpath("//a[@id='header_sign_in']")).click();
		
	}
	@Test(priority=3)
	public void createAccount() {
		driver.findElement(By.xpath("//div[@id='newToCostco']/following-sibling::a[1]")).click();
	}
	@Test(priority=4)
	public void enterEmailAddress() {
		driver.findElement(By.id("email")).sendKeys("atefehghalenoee@yahoo.com");
	}
	@Test(priority=5)
	public void enterNewPassword() {
		driver.findElement(By.id("newPassword")).sendKeys("Ali@123");
	}
	@AfterTest
	public void teardown() {
		driver.quit();
	}
}
