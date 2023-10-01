package features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsDisplayed {
	
    public static WebDriver driver;
	public static void main(String[] args) {
		
        driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		//By locators:
		
		By img = By.className("img-responsive");
		By searchBox = By.name("search");
		By seachBtn = By.cssSelector("#search > span > button");
		
		boolean flagImg = doIsElementDisplayed(img);
		if(flagImg) System.out.println("passed");
		
		boolean flagSearch = doIsElementDisplayed(searchBox);
		if(flagSearch) {
			doSendKeys(searchBox, "macbook");
			doClick(seachBtn);
		}

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	public static boolean doIsElementDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

}
