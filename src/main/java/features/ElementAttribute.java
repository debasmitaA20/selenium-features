package features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementAttribute {
	  static WebDriver driver;
	    
		public static void main(String[] args) {
			driver = new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
			
			By firstName = By.id("input-firstname");
			By img = By.className("img-responsive");
			
			String ph = getElementAttribute(firstName,"placeholder");
			String imgTitle = getElementAttribute(img,"title");
			
			System.out.println(ph);
			System.out.println(imgTitle);

	}
		
		public static WebElement getElement(By locator) {
			return driver.findElement(locator);
		}
		
		public static String getElementAttribute(By locator, String attributeName) {
			return getElement(locator).getAttribute(attributeName);
		}

}
