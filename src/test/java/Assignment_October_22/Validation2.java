package Assignment_October_22;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validation2 {

	
	public static WebDriver driver; 
	
	public static void main(String[] args) {
		
		WebDriverManager.chromiumdriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.chanel.com/us/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		String actualCurrentUrl="https://www.chanel.com/us/";
		String expectedCurrentUrl=driver.getCurrentUrl();
		String actualTitle="CHANEL Official Website: Fashion, Fragrance, Beauty, Watches, Fine Jewelry | CHANEL";
		String expectedTitle=driver.getTitle();
		
		if (actualCurrentUrl.equals(expectedCurrentUrl) && (actualTitle.equals(expectedTitle))) {
			System.out.println("My Url is Correct");
		}else {
			System.out.println("My Url isn't Correct");
			
		}
		
		
		
		
		
		

	}

}
