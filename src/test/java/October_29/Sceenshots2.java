package October_29;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sceenshots2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop.lululemon.com/");
		System.out.println(System.getProperty("user.dir"));
		WebElement ownscreenshot=driver.findElement(By.xpath("//script[@id='__NEXT_DATA__']/preceding::div[@class='hero_heroPrimaryCtaWrapper__sthnK']/preceding::img[1]"));
		File source=ownscreenshot.getScreenshotAs(OutputType.FILE);
		File destination= new File(System.getProperty("user.dir")+"\\screenshots\\screenshot3.png");
		FileHandler.copy(source, destination);
		
				
		
				
	}

}
