package Locators_23rd;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validation_WebElement {
	public static WebDriver driver;
	

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		String actualCurrentUrl="https://www.rediff.com/";
		String actualTitle="Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		String expectedCurrentUrl=driver.getCurrentUrl();
		String expectedTitle=driver.getTitle();
		if(actualCurrentUrl.equals(expectedCurrentUrl) && (actualTitle.equals(expectedTitle))){
			System.out.println("My Url is Correct");
		}else {
			System.out.println("My Url is not Correct");
			
		}
		WebElement signinLink = driver.findElement(By.className("signin"));
		if(signinLink.isEnabled() == true && signinLink.isDisplayed() == true) {
		signinLink.click();
		}else {
		System.out.println("The link is not working");
		}

		WebElement usernameTextBox = driver.findElement(By.id("login1"));
		if(usernameTextBox.isEnabled() == true && usernameTextBox.isDisplayed() == true) {
		usernameTextBox.sendKeys("seleniumpanda@rediffmail.com");
		}else {
		System.out.println("The username textbox field is not enabled or displayed");
		}

		WebElement passwordTextBox = driver.findElement(By.id("password"));
		if(passwordTextBox.isEnabled() == true && passwordTextBox.isDisplayed() == true) {
		passwordTextBox.sendKeys("Selenium@123");
		}else {
		System.out.println("The password textbox field is not enabled or displayed");
		}

		WebElement signinButton = driver.findElement(By.name("proceed"));
		if(signinButton.isEnabled() == true && signinButton.isDisplayed() == true) {
		signinButton.click();
		}else {
		System.out.println("The button is not enabled or displayed");
		}

		WebElement logOutLink = driver.findElement(By.className("rd_logout"));
		if(logOutLink.isEnabled() == true && logOutLink.isDisplayed() == true) {
		logOutLink.click();
		}else {
		System.out.println("The logout link is not enabled or displayed");
		}

		WebElement successfulSignOutMessage = driver.findElement(By.xpath("//p[contains(text(), 'You have successfully signed out of Rediffmail.')]"));
		if(successfulSignOutMessage.isDisplayed() == true) {
		System.out.println("Successful signout");
		}else {
		System.out.println("Not a success");
		}

		WebElement RediffHomePageLink = driver.findElement(By.xpath("//b[contains(text(), 'Rediff Home')]"));
		if(RediffHomePageLink.isEnabled() == true && RediffHomePageLink.isDisplayed() == true) {
		RediffHomePageLink.click();
		}else {
		System.out.println("The homepage link  is not enabled or displayed");
		}


		}

		}
