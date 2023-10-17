package testng_features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseTest {

	WebDriver driver;
	
	@Parameters({"url","browser"})
	@BeforeTest
	public void setup(String url, String browserName) {
		
		System.out.println("Running tests on.."+browserName);
		if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}else {
			System.out.println("Please pass correct browser name..");
		}
		
		System.out.println("Launching browser.");
		driver.get(url);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}
	
	
	@AfterTest
	public void tearDown() {
		System.out.println("Quitting browser.");
		driver.quit();
	}
}
