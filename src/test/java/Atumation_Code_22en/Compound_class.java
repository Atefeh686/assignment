package Atumation_Code_22en;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Compound_class {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromiumdriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("atefehghalenoee@yahoo.com");
		driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
		driver.findElement(By.xpath("//input[(@id='id_gender2')]")).click();
		driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("Atefeh");
		driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("Ghalenoee");
driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Ali@123");
		
		
		

	}

}
