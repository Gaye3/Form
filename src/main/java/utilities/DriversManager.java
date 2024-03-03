package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class DriversManager {
	
	public WebDriver driver;
	
	// Intialize webdrivers
	public void setup() {
		WebDriverManager.edgedriver().setup();
		
		//driver = new ChromeDriver();
		driver = new EdgeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}
	
	// Navigate to the application url
	public void navigateToUrl(String url) {
		driver.get(url);
	}
	
	
	//Close the webdrivers
	public void tearDown() {
		driver.quit();
	}
}
