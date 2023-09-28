package features;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
//encapsulation- private variable and public methods + public constructor
	private WebDriver driver;  //user might get the default value if we declare as public
	
	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	
	public void doClick(By locator) {
		getElement(locator).click();;
	}
	
	public String doElementGetText(By locator) {
		return getElement(locator).getText();
	}
	
	public boolean isElementDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	public String getElementAttribute(By locator, String attributeName) {
		return getElement(locator).getAttribute(attributeName);
	}
	
	public String getElementAttributes(By locator, String attributeName) {
		List<WebElement> elementList = getElements(locator);
		String attributeVal=null;
		for(WebElement e : elementList) {
			attributeVal = e.getAttribute(attributeName);
			System.out.println(e.getAttribute(attributeName));
		}
		return attributeVal;
	}
	
	public List<String> getElementTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleText = new ArrayList<String>();
		for(WebElement e : eleList) {
			eleText.add(e.getText());
		}	
		System.out.println("Count of elements in list:: "+eleText.size());	
		return eleText;
	}

}
