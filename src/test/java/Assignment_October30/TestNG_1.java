package Assignment_October30;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_1 {
	
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
        
		driver.get("https://www.facebook.com/");	
        System.out.println(driver.getTitle());
		}
		
		 @Test(priority=2)
		 public void clickOnCreateNewAaccount() {
			 driver.findElement(By.xpath("//div[@id='reg_pages_msg']/preceding::a[1]")).click();
		     }
			
	 
		 @Test(priority=3)
		 public void enterFirstName() {
			 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Atefeh");
		 }
		 @Test(priority=4)
		 public void enterLastName() {
			 driver.findElement(By.name("lastname")).sendKeys("Ghalenoee");
			 
		 }
		 @Test(priority=5)
		 public void enterMobileNumberOrEmail() {
			 driver.findElement(By.xpath("//input[contains(@name,'reg_email__')]")).sendKeys("atefehghalenoee@yahoo.com");
		 }
		 @Test(priority=6)
		 public void reEnterEmail() {
		 driver.findElement(By.xpath("//input[contains(@name,'reg_email_confirmation__')]")).sendKeys("atefehghalenoee@yahoo.com");
		 
		 }
		 @Test(priority=7)
		 public void enterNewPassword() {
			 driver.findElement(By.xpath("//input[contains(@id,'password_step_input')]")).sendKeys("Ali@123");
		 }
		 
			 
		 
		 
		 @AfterTest
		 public void tearDown() {
		 driver.quit();
		 }
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}


