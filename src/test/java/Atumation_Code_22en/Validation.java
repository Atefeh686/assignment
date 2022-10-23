package Atumation_Code_22en;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validation {
	
	  public static WebDriver driver;
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromiumdriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://walmart.com");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		String actualCurrentUrl= "https://www.walmart.com/";
		String expectedCurrentUrl=driver.getCurrentUrl();
		
		String actualTitle="Walmart.com | Save Money. Live Better";
		String expectedTitle=driver.getTitle();
		
		
		if (actualCurrentUrl.equals(expectedCurrentUrl) && (actualTitle.equals(expectedTitle))) {
			
			System.out.println("My Url is Correct");
			
		}else {
			
			System.out.println("My Url isn't Correct" );
		}
		
		
		
	
		
		

	}

}
