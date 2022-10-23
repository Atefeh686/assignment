package Assignment_October_22;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validation5 {
 public static WebDriver driver;
 
	public static void main(String[] args) {
	WebDriverManager.chromiumdriver().setup();
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.macys.com/");
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	String actualCurrentUrl="https://www.macys.com/";
	String expectedCurrentUrl=driver.getCurrentUrl();
	String actualTitle="Macy's - Shop Fashion Clothing & Accessories - Official Site - Macys.com";
	String expectedTitle=driver.getTitle();
	
	
	if(actualCurrentUrl.equals(expectedCurrentUrl) && (actualTitle.equals(expectedTitle))){
		System.out.println("My Url is Correct");
	}else {
		System.out.println("My Url is not Correct");
		
	}
	

	}

}
