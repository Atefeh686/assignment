package October_29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDwon {
	public static Select select;

	public static void main(String[] args){
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//div[@id='reg_pages_msg']/preceding::a[1]")).click();
		driver.findElement(By.name("firstname")).sendKeys("Atefeh");
		
driver.findElement(By.name("lastname")).sendKeys("Ghalenoee");
		
		driver.findElement(By.xpath("//input[contains(@name,'reg_email__')]")).sendKeys("atefehghalenoee@yahoo.com");
		
		driver.findElement(By.xpath("//input[contains(@name,'reg_email_confirmation__')]")).sendKeys("atefehghalenoee@yahoo.com");
		driver.findElement(By.xpath("//input[contains(@id,'password_step_input')]")).sendKeys("Ali@123");
		
	select=new Select(driver.findElement(By.id("month")));
	select.selectByVisibleText("November");
	
	
	select=new Select(driver.findElement(By.id("day")));
	select.selectByVisibleText("28");
	
	select=new Select(driver.findElement(By.id("year")));
	select.selectByVisibleText("1979");
	
	
	
		
		
		
	}

}
