package atumation_code_9thOctober;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFirstAutomationCode {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver3=new ChromeDriver();
		driver3.get("https://www.facebook.com/");
		driver3.manage().window().maximize();
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver2=new ChromeDriver();
		driver2.get("https://www.amazon.com/");
		driver2.manage().window().maximize();
		
		
		


		WebDriverManager.firefoxdriver().setup();
		WebDriver driver1 = new FirefoxDriver();
		driver1.get("https://www.flipkart.com/");
		driver1.manage().window().maximize();

		driver.quit();
		driver1.quit();
        driver3.quit();
        driver2.quit();
	}

}