package features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser { //slightly fast as compared to normal execution

	static WebDriver driver;
	public static void main(String[] args) {
		ChromeOptions co = new ChromeOptions();
		driver = new ChromeDriver(co.addArguments("--headless=new"));
		

	}

}
