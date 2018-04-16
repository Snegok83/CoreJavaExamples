import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckGoogleHomeConnection {

	private static String driverType="webdriver.chrome.driver"; 
	private static String pathToDriver="C:\\tmp\\chromedriver.exe";
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty(driverType, pathToDriver);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		driver.close();
		
	}

}
