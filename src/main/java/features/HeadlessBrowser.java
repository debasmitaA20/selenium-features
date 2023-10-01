package features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class HeadlessBrowser { //slightly fast as compared to normal execution
//we use it for sanity tests, for complex html dom, it might not work
	static WebDriver driver;
	public static void main(String[] args) {
		
	/*	ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito");
		co.addArguments("--headless = new");
		driver = new ChromeDriver(co);*/
		
	/*
	 * FirefoxOptions fo = new FirefoxOptions(); fo.addArguments("--headless");
	 * driver = new FirefoxDriver(fo);
	 */
		
		EdgeOptions eo = new EdgeOptions();
		eo.addArguments("--headless");
		driver = new EdgeDriver(eo);
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
        driver.quit();
	}

}
