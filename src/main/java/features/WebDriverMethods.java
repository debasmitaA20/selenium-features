package features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.de/");
		
		//driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().window().fullscreen();
		
		String url = driver.getCurrentUrl();
		
		if(url.contains("amazon.com")) {
			System.out.println("passed.");
		}

		String pageSource = driver.getPageSource();
		
		String title = driver.getTitle();
	}

}
