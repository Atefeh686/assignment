package Assignment_October23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
 public static WebDriver driver;
 
	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		String actualCurrentUrl="https://www.facebook.com/";
		String actualTitle="Facebook - log in or sign up";
		String expectedCurrentUrl=driver.getCurrentUrl();
		String expectedTitle=driver.getTitle();
		
		
		if(actualCurrentUrl.equals(expectedCurrentUrl) &&(actualTitle.equals(expectedTitle))) {
			System.out.println("My Url is Correct ");
		}else {
			System.out.println("My Url isn't Correct");
		}
		
		WebElement createnewaccountButton=driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		if(createnewaccountButton.isEnabled() == true && createnewaccountButton.isDisplayed()== true) {
			createnewaccountButton.click();
		}else {
			System.out.println("The Createnewaccount is not enabled or displayed");
			
		}
		
		WebElement firstnameTextBox=driver.findElement(By.xpath("//input[@name='firstname']"));
		if( firstnameTextBox.isEnabled()== true &&  firstnameTextBox.isDisplayed()== true) {
			firstnameTextBox.sendKeys("Atefeh");
		}else {
			System.out.println("lastnameTextBox");
			
		}
		WebElement lastnameTextBox=driver.findElement(By.xpath("//input[@name='lastname']")); 
		if(lastnameTextBox.isEnabled() == true && lastnameTextBox.isDisplayed() == true) {
			lastnameTextBox.sendKeys("Ghalenoee");
		}else {
			System.out.println("The Createnewaccount is not enabled or displayed");
			
		}
		WebElement mobilenumberoremailTextBox=driver.findElement(By.xpath("//input[contains(@name,'reg_email__')]"));
		if(mobilenumberoremailTextBox.isEnabled()==true && mobilenumberoremailTextBox.isDisplayed()== true) {
			mobilenumberoremailTextBox.sendKeys("atefehghalenoee@yahoo.com");
		}else {
			System.out.println("The mobilenumberoremailTextBox is not enabled or displayed");
		}
		
WebElement reenteremailTextBox=driver.findElement(By.xpath("//input[contains(@name,'reg_email_confirmation__')]"));
if (reenteremailTextBox.isEnabled()== true && reenteremailTextBox.isDisplayed()==true) {
	reenteremailTextBox.sendKeys("atefehghalenoee@yahoo.com");
}else {
	System.out.println("The reenteremailTextBox is not enabled or displayed");
}

WebElement newpasswordTextBox=driver.findElement(By.xpath("//input[contains(@id,'password_step_input')]"));
if(newpasswordTextBox.isEnabled()== true && newpasswordTextBox.isDisplayed()== true) {
	newpasswordTextBox.sendKeys("Ali@123");
	}else {
		System.out.println("The newpasswordTextBox is not enabled or displayed");
	}
		

	}
}

