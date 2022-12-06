import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Adactin_Incognito {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		ChromeOptions options= new ChromeOptions();
		options.addArguments("incognito");
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
	}

}
