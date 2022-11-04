package Assignment_October30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_5 {
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
		driver.get("https://shop.lululemon.com/");
		System.out.println("This is the title:"+ driver.getTitle());
	}
	@Test (priority=2)
	public void clickOnSignIn(){
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		
	}
	@Test (priority=3)
	public void enterEmailAddress(){
		driver.findElement(By.id("username")).sendKeys("atefehghalenoee@yahoo.com");
		
}
@Test(priority=4)
public void enterPassWord() {
	driver.findElement(By.id("password")).sendKeys("Mommy@123");
	
}
@Test(priority=5)
public void clickOnForgetPassword() {
	driver.findElement(By.linkText("Forgot your password?")).click();
}
@Test(priority=6)
public void emailAddressBox() {
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("atefehghalenoee@yahoo.com");
}
@AfterTest
public void tearDown() {
	driver.quit();
}
}
