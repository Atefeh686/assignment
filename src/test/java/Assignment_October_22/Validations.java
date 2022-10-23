package Assignment_October_22;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validations {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
      WebDriverManager.chromiumdriver().setup();
      driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.target.com/");
      driver.manage().window().maximize();
      
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      System.out.println(driver.getCurrentUrl());
      System.out.println(driver.getTitle());
      
      String actualCurrentUrl="https://www.target.com/";
      
      String expectedCurrentUrl=driver.getCurrentUrl();
      
      String actualTitle="Target : Expect More. Pay Less.";
      String expectedTitle=driver.getTitle();
      
      if (actualCurrentUrl.equals(expectedCurrentUrl) && (actualTitle.equals(expectedTitle))) {
    	  System.out.println("My Url is Correct");
      }else {
    	  System.out.println("My Url isn't Corret");
      }
      
    




	}

}
