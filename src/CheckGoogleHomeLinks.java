import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckGoogleHomeLinks {

		
		private static String driverType="webdriver.chrome.driver"; 
		private static String pathToDriver="C:\\tmp\\chromedriver.exe";
		public static WebDriver driver;
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			System.setProperty(driverType, pathToDriver);
			 driver = new ChromeDriver();
			 driver.get("https://google.com");
			 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
		
			List<WebElement> links = driver.findElements(By.tagName("a"));
			System.out.println(links.size());
			
			for (WebElement e : links) {
				String checkLinkName = e.getText();
			System.out.println(checkLinkName);
			
			}
			driver.get("https://google.com");
			driver.close();
	}

}
