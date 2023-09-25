package features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;


public class BrowserUtils {

	private WebDriver driver; //null
	
	/**
	 * This method is used to initialize the driver
	 * based on the browser
	 * @param browser
	 * @return instance of WebDriver
	 */
	public WebDriver initDriver(String browser) {
		//SeleniumManager is natively available with the Selenium-Java dependency. (>4.6.0)
		switch(browser.toLowerCase().trim()) {
		case "chrome" :
			driver = new ChromeDriver();
			break;
		case "firefox":	
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		default:
			System.out.println("Please enter correct browser name..."+browser);
			break;
		}
		System.out.println("Launching browser.."+browser);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		return driver;		
	}
	
	public void launchURL(String url) {
		if(url==null) {
			System.out.println("URL cannot be null..");
		}
		if(url.indexOf("https")==0) { //InvalidArgumentException when http is used instead of https
			driver.get(url);
		}
	}
	
	public String getPageTitle() {
		System.out.println("Page title is :: "+driver.getTitle());
		return driver.getTitle();
	}
	
	public String getPageURL() {
		System.out.println("Page url is :: "+driver.getCurrentUrl());
		return driver.getCurrentUrl();
	}
	
	public void closeBroser() {
		if(driver !=null) { //NullPointerException
			driver.close();
		}
	}
	public void quitBroser() {
		if(driver !=null) { //NullPointerException
			driver.quit();
		}
	}
	
}
