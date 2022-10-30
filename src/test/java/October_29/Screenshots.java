package October_29;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshots {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://openweathermap.org/");
		System.out.println(System.getProperty("user.dir"));
		WebElement ownScreen= driver.findElement(By.cssSelector("div.section.where-to"));
		File source=ownScreen.getScreenshotAs(OutputType.FILE);
		File destination=new File(System.getProperty("user.dir")+ "\\screenshots\\screenshot1.png");
		FileHandler.copy(source, destination);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.shaadi.com/");
		
		WebElement shaadiBanner=driver.findElement(By.cssSelector("div.css-1k9g704"));
		File source1=shaadiBanner.getScreenshotAs(OutputType.FILE);
		File destination1=new File (System.getProperty("user.dir")+"\\screenshots\\screenshot2.png");
		FileHandler.copy(source1, destination1);
		
	}


}




