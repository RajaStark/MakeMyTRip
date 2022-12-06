package Fcebook_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_xpath {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\azhag\\eclipse-workspace\\Selenium\\Chrome\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("virat18@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456789");
		driver.findElement(By.xpath("//button[contains(@data-testid,'royal_login_button')]")).click();
		Thread.sleep(6000);
		driver.navigate().back();
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Virat");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kohli");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("6344551122");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@aria-label='New password']"));
		Thread.sleep(6000);
		

		
		
				}

}
