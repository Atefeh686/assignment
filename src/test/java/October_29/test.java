package October_29;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
		
		
		
		
		
		
		
		//lulu
		//driver.get("https://shop.lululemon.com/");
		//driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		//driver.findElement(By.id("username")).sendKeys("atefehghalenoee@yahoo.com");
	//	driver.findElement(By.id("password")).sendKeys("Mommy@123");
		//driver.findElement(By.linkText("Forgot your password?")).click();
	//	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("atefehghalenoee@yahoo.com");
		
		
		
		
		
		
		
		//driver.findElement(By.xpath("//a[@id='header_sign_in']")).click();
		//Thread.sleep(3000);
		
		//driver.findElement(By.xpath("//footer[@id='footer-widget']/preceding::a[@id='createAccount']")).click();
		
	//amazon
		//driver.findElement(By.xpath("//span[text()='Hello, sign in']")).click();
		//driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
	//	driver.findElement(By.id("ap_customer_name")).sendKeys("Atefeh");
		
		//driver.findElement(By.id("ap_email")).sendKeys("atefehghalenoee@yahoo.com");
		
	
		
		
	}

}