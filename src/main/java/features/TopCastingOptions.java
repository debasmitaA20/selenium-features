package features;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;

public class TopCastingOptions {

	public static void main(String[] args) {
	
		ChromiumDriver driver = new ChromeDriver();
		
	}

}




//ChromeDriver driver = new ChromeDriver(); --browser specific-valid but not recommended- doesn't support crossbrowser testing
//ChromiumDriver driver = new ChromeDriver();
//RemoteWebDriver driver = new ChromeDriver(); //RemoteWebDriver has the implementation of all WebDriver methods
     //-valid top casting -recommended
//WebDriver driver = new ChromeDriver();--valid top casting-recommended
//SearchContext driver = new ChromeDriver(); --only 2 methods can be accessed- findElement/s

//WebDriver driver = new RemoteWebDriver("remoteAddress",capabilities); //valid topcasting and recommended

//SearchContext driver = new RemoteWebDriver();//valid but not recommended
