package atumation_code_9thOctober;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class code1 {

	public static void main(String[] args) {
	
		
			
		WebDriverManager.chromedriver().setup();
		WebDriver driver1=new ChromeDriver();
		driver1.get("https://www.qatarairways.com/en-us/homepage.html");
		driver1.manage().window().maximize();
		
		
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver2=new FirefoxDriver();
		driver2.get("https://www.qatarairways.com/en-us/homepage.html");
		driver2.manage().window().maximize();
		
		
		
		
		
		
		
		driver1.quit();
		driver2.quit();
		
	}

}
