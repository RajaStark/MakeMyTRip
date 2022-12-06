package com.Baseclass;

import java.awt.AWTException;
import java.awt.List;
import java.awt.Robot;
import java.io.File;
import java.util.LinkedList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.Select;

import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.github.dockerjava.core.async.FrameStreamProcessor;

import io.github.bonigarcia.wdm.WebDriverManager;

@SuppressWarnings("deprecation")
public class Baseclass {
	
	public static WebDriver driver;
	
	//1 browserlaunch
	private WebDriver browserlaunch(String type) {
    	
		if (type.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			
			 driver = new ChromeDriver();
			
		}
		else if (type.equalsIgnoreCase("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			
			 driver = new FirefoxDriver();
			
		}
		driver.manage().window().maximize();
		return driver;
	}
   //2.getUrl
	private void getUrl(String url) {
    	driver.get(url);
	}
   //3.navigation
	private void navigation(String Newurl) {
    	
		driver.navigate().to(Newurl);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
    }
  //4.alert
	private void alert(String type, String value) {
    	Alert alert = driver.switchTo().alert();
    	if (type.equalsIgnoreCase("ok")) {
    		alert.accept();
			}
    	else if (type.equalsIgnoreCase("cancel")) {
    		alert.dismiss();
			}
    	else if (type.equalsIgnoreCase("sendkeys")) {
    		alert.sendKeys("name");
			}
    	else if (type.equalsIgnoreCase("gettext")) {
    		alert.getText();
		    }
	}
    //5.actions
	private void actions(WebElement elementA,WebElement elementB, String type) {
    	Actions actions = new Actions(driver);
    	
    	if (type.equalsIgnoreCase("click")) {
    		actions.click().build().perform();
    		}
    	else if (type.equalsIgnoreCase("doubleclick")) {
    		actions.doubleClick().build().perform();
    		}
    	else if (type.equalsIgnoreCase("contextclick")) {
    		actions.contextClick().build().perform();
			}
    	else if (type.equalsIgnoreCase("movetoelement")) {
    		actions.moveToElement(elementB).build().perform();
			}
    	else if (type.equalsIgnoreCase("draganddrop")) {
    		actions.dragAndDrop(elementA, elementB).build().perform();
			}
    	else if (type.equalsIgnoreCase("clickandhold")) {
    		actions.clickAndHold().build().perform();
    		}
    	}
   //6.Frame
	private void frame(WebElement element,String nameOrId,int index ) {
    	driver.switchTo().frame(element);
    	driver.switchTo().frame(nameOrId);
    	driver.switchTo().frame(index);
    	driver.switchTo().parentFrame();
    	driver.switchTo().defaultContent();
		
    }
    //7.robot
	private void robot(int keyindex) throws AWTException {
	  Robot	r = new Robot();
	  r.keyPress(keyindex);
	  r.keyRelease(keyindex);
	 
    }
	//8.GetTittle
	
 private String getTitle() {
    String title = driver.getTitle();
    return title;
}
 
 //9.getUrl
 private String getUrl() {
	String Url= driver.getCurrentUrl();
	return Url;

}
 //10.Get Attribute
 
 private String getattribute(String type, WebElement element) {
	 
	String attribute = element.getAttribute(type);
	
	return attribute;
	 
}
		//11.scrollUp,Down
 private void scroll(String value) {
  
	 JavascriptExecutor	js=(JavascriptExecutor) driver;
	 js.executeAsyncScript(value);

}
 
 //12.WindowHandle
 private void windowhandle() {
     driver.getWindowHandle();

}
 

//14.IsMultiple
 private boolean Ismultiple(WebElement element) {
	 
	 Select sc = new Select(element);
	 boolean multiple = sc.isMultiple();
	 
	 return multiple;
	 
	 }
 
 //15.Sendkeys
 
 private void sendkeys(WebElement element) {
	element.sendKeys();
	
     }
 //16. refresh
 private void refersh() {
	driver.navigate().refresh();

}
 //17.Click
 private void clickelement(WebElement element) {
	element.click();

}
 
 //18. Close and Quit
 private void closeQuit() {
	driver.close();
	driver.quit();

}
 //17.Wait
 private void wait(int value) throws InterruptedException {
	 Thread.sleep(value);
	
}
 //18.DropDown
 private void dropdown(String type, WebElement element, String value ) {
	 Select slc = new Select(element);
	 
	 if (type.equalsIgnoreCase("selectbyindex")) {
		 int data = Integer.parseInt(value);
		 slc.selectByValue(value);
		
	}
	 else if (type.equalsIgnoreCase("selectbyvalue")) {
		 int data = Integer.parseInt(value);
		 slc.selectByIndex(data);
		
	}
	 else if (type.equalsIgnoreCase("selectbyvisibletext")) {
		 slc.selectByVisibleText(value);
		
	}
	 
}
 
//19.Clear
  private void clear(WebElement element) {
	  element.clear();
}
  
 //20.ScreenShot
 
   private void screenShot(String pathname) {
		TakesScreenshot ss = (TakesScreenshot) driver;
		File fd = ss.getScreenshotAs(OutputType.FILE);
		File pic = new File(pathname);
		
	}
	//   21. GET FIRST SELECTED OPTIONS
	private String getFirstSelectedOption(WebElement element) {
		Select sl = new Select(element);
		WebElement firstSelectedOption = sl.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		return text;
	}
	//   22. GET OPTIONS
	public static List<Object> getOptions(WebElement element) {
		Select sl = new Select(element);
		List<Object> data = new LinkedList<Object>();
		List<WebElement> options = sl.getOptions();
		for (WebElement getOpt : options) {
			String text = getOpt.getText();
			data.add(text);
		}
		return data;
		
	}
	//  23.  GET ALL SELECTED OPTIONS
		public static List<Object> getAllSelectedOption(WebElement element) {
		Select sl = new Select(element);
		List<Object> data = new LinkedList<Object>();
		List<WebElement> allSelectedOptions = sl.getAllSelectedOptions();
		for (WebElement allOptions : allSelectedOptions) {
			String text = allOptions.getText();
			data.add(text);
		}
		return data;

 
 
 
	
	
		}
		
		
}
    
    
  
	

	
    
    
	
    
		

	


