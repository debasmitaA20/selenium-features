package features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumManagerConcepts {

	public static void main(String[] args) {
		//the getInstance()method will return an instance of SeleniumManager
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		driver.quit();

	}

}
