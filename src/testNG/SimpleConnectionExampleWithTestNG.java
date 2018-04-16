package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class SimpleConnectionExampleWithTestNG {
 
	
	private static String driverType = "webdriver.chrome.driver";
	private static String pathToDriver = "C:\\tmp\\chromedriver.exe";
	private static WebDriver driver;
  
	@BeforeTest
  public void beforeTest() {
  
		System.setProperty(driverType, pathToDriver);
		
		driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
  }

  
  @Test
  public void f() {
	  
	  List<WebElement> links = driver.findElements(By.tagName("a"));
		//Print number of found links from a page
		System.out.println(links.size());
		//taking names of links 
		for (WebElement e : links) {
			String checkLinkName = e.getText();
			System.out.println(checkLinkName);

		}
  
  }
  
  
  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
