package October15th;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Using_If_Else {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub




	

		String Browser = "Chrome";
		String Browser1 = "Firefox";
		String Browser2 = "Edge";

		if (Browser.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://google.com/");

		} else if (Browser1.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://flipkart.com/");

		} else if (Browser2.equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://amazon.com/");
		}

		else {
			System.out.println("None of the browser works");
		}
	}



	}


