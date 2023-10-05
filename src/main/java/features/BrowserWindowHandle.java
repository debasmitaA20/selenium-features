package features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandle {
	
    static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://debasmitaa-osondemand.orangehrm.com/symfony/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//img[contains(@alt,'OrangeHRM on twitter')]")).click();

	}

}
