package features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClickSendKeys {

	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By fname = By.id("input-firstname");
		By lname = By.id("input-lastname");
		By submit = By.xpath("//input[@type='submit']");
		
		doActionsSendkeys(fname,"debasmita");
		doActionsSendkeys(lname,"adhikari");
		doActionsClick(submit);

		//ElementInteractableException or ElementNotInterceptedException -- in these cases we can use Actions.sendKeys()
		//Actions sendkeys() == click() + sendKeys()
		//to pin point to a specific element e.g. checkbox
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);			
	}
	
	public static void doActionsSendkeys(By locator, String keys) {
		Actions action = new Actions(driver);
		action.sendKeys(getElement(locator), keys).build().perform();
	}
	
	public static void doActionsClick(By locator) {
		Actions action = new Actions(driver);
		action.click(getElement(locator)).build().perform();
	}

}
