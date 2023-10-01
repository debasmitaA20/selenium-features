package features;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationConcept {

	static WebDriver driver;
	
	public static void main(String[] args) throws MalformedURLException {
		
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com/"); //driver.get() = driver.navigate().to() : both launch the url. to() method calls get() internally. 
		
		System.out.println(driver.getTitle());
		
		driver.get("https://www.amazon.in/");
		
		//driver.navigate().to(new URL("https://www.amazon.in/")); 
		
		System.out.println(driver.getTitle());
		//back and forward simulation on browser:
		driver.navigate().back();
		
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		
		System.out.println(driver.getTitle()); 
		
		driver.navigate().refresh();
		
		//Navigation nav = new Navigation();
		//nav.to(null);
		
		/*
		 * driver.close(); //session id = 123 driver.getTitle(); // session id = 123 -
		 * InvalidSessionID
		 * 
		 * driver.quit(); //session id = null; driver.getTitle(); //NoSessionException
		 */		
	}

}
