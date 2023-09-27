package features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class LaunchFirefox {

	//Selenium 4.12.0 is about Firefox 
	
	public static void main(String[] args) {
		//firefox stable version - 117 will be downloaded if already not available in the system
		//dev 118, nightly geckodriver.exe
		
		FirefoxOptions op = new FirefoxOptions();
		op.setBrowserVersion("nightly");
		//115 (old)it will check if geckodriver.exe 115 is already available. If not, geckdriver 115 + firefox 115 will be downloaded
		WebDriver driver = new FirefoxDriver(op);
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		
		//0.33.0 - it supports 114, 115, 116, 117 and 118
		//future/unstable : beta/dev/nightly could also be used - the firefox versions/builds will be downloaded

	}

}
