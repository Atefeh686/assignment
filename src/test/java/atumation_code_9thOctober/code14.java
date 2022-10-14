package atumation_code_9thOctober;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class code14 {

	public static void main(String[] args) {

WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.youtube.com/");
driver.manage().window().maximize();





WebDriverManager.firefoxdriver().setup();
WebDriver driver1=new FirefoxDriver();
driver1.get("https://www.youtube.com/");
driver1.manage().window().maximize();









driver.quit();
driver1.quit();



	}

}
