package October_29;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTab_NewWindow {
public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromiumdriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://rediff.com");
		driver.manage().window().maximize();
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.google.com/");
		
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.amazon.com/");
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.costco.com/");
		
		driver.quit();
		
		
		
		openWindow();
		
	
	}
	
		static void openWindow() {
			
	
			driver.switchTo().newWindow(WindowType.WINDOW);
		driver.navigate().to("https://www.easemytrip.com/");
		
	
		driver.switchTo().newWindow(WindowType.WINDOW);
	
		driver.navigate().to("https://www.rediff.com/");
		
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.navigate().to("https://www.facebook.com/");
		
		
		
		driver.quit();
		
		

		
	}

}
