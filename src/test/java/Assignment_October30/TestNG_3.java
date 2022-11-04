package Assignment_October30;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_3 {

	public static WebDriver driver;

	
	
	@BeforeTest
	public void launchBrowser() {
		
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();

	
	}
	
	@Test(priority=1)
	public void setUp() {
		driver.get("https://www.amazon.com/");
		System.out.println(driver.getTitle());
	}
	 
	@Test(priority=2)
	public void accountButton() {
		driver.findElement(By.xpath("//span[text()='Hello, sign in']")).click();
		
	}
	@Test(priority=3)
	public void entercreateAccount() {
		driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
		
	}
	@Test(priority=4)
	public void enterYourName() {
		driver.findElement(By.id("ap_customer_name")).sendKeys("Atefeh");
		
	}
	@Test(priority=5)
	public void enterEmailOrPhoneNumber() {
		driver.findElement(By.id("ap_email")).sendKeys("atefehghalenoee@yahoo.com");
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	
}

