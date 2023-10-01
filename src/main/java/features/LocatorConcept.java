package features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		ElementUtil eleUtil = new ElementUtil(driver);
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//findElement and findElements - SearchContext interface->defined in RemoteWebDriver  class->inherited by ChromiumDriver->ChromeDriver
		
		//1st approach- there is no reusability of the webelements. We are not storing the elements in a WebElement ref variable
		/*
		 * driver.findElement(By.id("input-email")).sendKeys("debasmita");
		 * driver.findElement(By.id("input-password")).sendKeys("test123");
		 */
		
		//2nd approach- Here we are hitting the server unnecessarily everytime we try to loacte an element. If we do not want to use that element
		/*
		 * WebElement email = driver.findElement(By.id("input-email"));
		 * email.sendKeys("debasmita"); WebElement password =
		 * driver.findElement(By.id("input-password")); password.sendKeys("test123");
		 */
		
		//3rd approach - with this approach, we store the By locators. We use them when we want to.
		//When new elements are added to the page, we can just store them as By locators, without having to hit the server. We can use them when necessary
		/*
		 * By email_ = By.id("input-email"); By pass_ = By.id("input-password");
		 * WebElement email_field = driver.findElement(email_);
		 * email_field.sendKeys("debasmita");
		 */
		
		//4th approach - By locator + generic method - reusability of code - We are hitting driver.findElement(By by) only once for all the By locators
		/*
		 * By email_ = By.id("input-email"); By pass_ = By.id("input-password");
		 * getElement(email_).sendKeys("debasmita");
		 * getElement(pass_).sendKeys("test123");
		 */
		
		//5th approach - By locators + generic method for By locators + generic method for actions- sendKeys, click
		/*
		 * By email_ = By.id("input-email"); By pass_ = By.id("input-password");
		 * doSendKeys(email_, "debasmita"); doSendKeys(pass_,"test123");
		 */
		
		//6th approach - By locators + generic method for By locators + generic method for actions- sendKeys, click + ElementUtil class
		By email_ = By.id("input-email");
		By pass_ = By.id("input-password");
		eleUtil.doSendKeys(email_, "debasmita");
		eleUtil.doSendKeys(pass_,"test123");
		
		driver.close();
	}

}
