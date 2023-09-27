package features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		BrowserUtil utils = new BrowserUtil();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.de/");
		
		//driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		if(url.contains("amazon.de")) {
			System.out.println("passed.");
		}

		String pageSource = driver.getPageSource();
		//System.out.println(pageSource);
		
		String title = driver.getTitle();
		System.out.println(title);
		utils.quitBrowser();//session id = null
		//utils.closeBrowser
		
		title = driver.getTitle();//NoSuchSessionException
		System.out.println(title);
		
	}

}
