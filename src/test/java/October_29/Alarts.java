package October_29;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alarts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		
		Alert alert= driver.switchTo().alert();
		String text=alert.getText();
		System.out.println("the text of the alert is:" + text);
		
		if(text.equals("please enter a avalid name")) {
			Thread.sleep(2000);		
			
		alert.accept();
		
		}else {
		alert.dismiss();
	}
	
		Thread.sleep(2000);
		 
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediddmail.com");
		driver.findElement(By.id("password")).sendKeys("selenium@123");
		
		
		
	}

}
