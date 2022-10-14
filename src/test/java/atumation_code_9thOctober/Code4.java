package atumation_code_9thOctober;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Code4 {

	public static void main(String[] args) {

		
		WebDriverManager .chromiumdriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		
		WebDriverManager .firefoxdriver().setup();
		WebDriver driver1= new FirefoxDriver();
		driver1.get("https://www.facebook.com/");
		driver1.manage().window().maximize();
		
		
		
		
		driver.quit();
		driver1.quit();
		
		
		
		
		
		
	}

}
