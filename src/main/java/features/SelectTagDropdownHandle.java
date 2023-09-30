package features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTagDropdownHandle {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://orangehrm.com/en/30-day-free-trial");

		By country = By.id("Form_getForm_Country");
		//dropdown -- htmltag -- <select>
		//Use Select class
		//WebElement countryEle = driver.findElement(country);
		//Select select = new Select(countryEle); //Select constructor takes WebElement as argument
		//select.selectByIndex(5); //byIndex - can used when values are constant starts from index 0
		//select.selectByValue("India"); //byValue - fetch the "value" attribute of the <option> tag
		//<option value="Afghanistan">Afghanistan
		//select.selectByVisibleText("Belgium"); //byVisibleText - if value attribute is not available	
		doSelectDropDownByIndex(country,5);
		Thread.sleep(2000);
		doSelectDropDownByValue(country, "Afghanistan");
		Thread.sleep(2000);
		doSelectDropDownByVisibleText(country, "India");
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectDropDownByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public static void doSelectDropDownByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	public static void doSelectDropDownByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}

}
