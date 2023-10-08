package features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementRefException {

	public static void main(String[] args) {
		
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		WebElement fname = driver.findElement(By.id("input-firstname"));
		fname.sendKeys("debasmita");
		
		driver.navigate().refresh(); //DOM gets refreshed too. DOM first, then page.
		
		fname.sendKeys("adhikari"); //StaleElementReferenceException: stale element reference: stale element not found
	}
	
	//click, back, forward, refresh

}
