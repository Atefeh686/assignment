package Assignment_October_22;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validation3 {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		String actualCurrentUrl="https://www.amazon.com/";
		String expectedCurrentUrl=driver.getCurrentUrl();
		String actualTitle="Amazon.com. Spend less. Smile more.";
		String expectedTitle=driver.getTitle();
		if (actualCurrentUrl.equals(expectedCurrentUrl) && (actualTitle.equals(expectedTitle))) {
			System.out.println("My Url is Correct");
		}else {
			System.out.println("My Url isn't Corret");
		}
	}
}

		
		
		
		