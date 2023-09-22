package features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		//for all browsers- there is a driver class
		
		String browser = "chrome";
		WebDriver driver=null; 
		//launch the browser
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}else if(browser.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		}else {
			System.out.println("Please enter a correct browser name."+browser);
		}
		
		//enter url
		driver.get("https://www.google.com");
		
		//get the title
		String title = driver.getTitle();
		System.out.println("title os my page--"+title);
		
		//validation
		if(title.equals("Google")) {
			System.out.println("Matched - Passed");
		}else {
			System.out.println("Didn't match - Failed");
		}
		
		//Automation testing = automated tests + validation
		//close the browser
		driver.quit();

	}

}
