package features;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitInSelenium {

	public static void main(String[] args) {
		// Static wait--Thread.sleep(int milli)
		//dynamic wait-- Implicitly Wait -- applies to all elements  - global wait
		//--Explicit wait -- to specific elements + polling time/interval time
		     //-->WebDriverWait (class) child of ->FluentWait(class)->child of Wait(interface)
		     //Wait : until() method overridden
		
      WebDriver driver = new ChromeDriver();
      driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
      
      //implicitlyWait --only for web element:svg, iframe, WebElement
      //it doens't support non WebElement - title of page, url, alerts etc.
	}

}
