package Webtable;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webtable {
	static WebDriver driver;
	public static int indexofpopulation;
	public static int indexofcountry;
	
	private static void browser() {
		
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("https://www.worldometers.info/coronavirus/");
		

	}
	
	 private static void getallHeader() {
		Map<Integer, String> headerMap = new LinkedHashMap<Integer, String>();
		List<WebElement> allheaders = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/thead/tr/th"));
		for (int i = 0; i < allheaders.size(); i++) {
			 String headers = allheaders.get(i).getText().replace("\n","");
			 headerMap.put(i, headers);
			 if (headers.equalsIgnoreCase("population")) {
				 indexofpopulation=i;
				}
			 else if (headers.contains("country")) {
				 indexofcountry=i;
				
			}

	  }
		  System.out.println(headerMap);
			 
			}
      private static void Alldata() {
    	  List<WebElement> alldatas = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody[1]/tr/td"));
    	 for (WebElement webElement : alldatas) {
    		 System.out.println(webElement.getText());
			
		}
    	 
    	  
	

}
	
	private static void covid() {
		driver.get("https://www.worldometers.info/coronavirus/");
	java.util.List<WebElement> alldata = driver.findElements(By.xpath("//table[@id='main_table_countries_today']/tbody[not(@class)]/tr"));
		 for (WebElement webelement : alldata) {
			 System.out.println(webelement.getText());
		 }

	}
	private static void getparticular() {
		 WebElement particularvalue= driver.findElement(By.xpath("//table[@id='main_table_countries_today']/tbody[1]/tr[7]/td[15]"));
		System.out.println(particularvalue.getText());

	}
	private static void Countrylist() {
		WebElement Listofcountry = driver.findElement(By.xpath("//table[@id='main_table_countries_today']/tbody[1]/tr/td[2]"));
		System.out.println(Listofcountry.getText());

	}
	
	
	
	public static void main(String[] args) {
		browser();
		getallHeader();
		//Alldata();
		//covid();
		//getparticular();
		//Countrylist();
		
	}
}

  
    