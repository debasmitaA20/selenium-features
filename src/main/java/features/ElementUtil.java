package features;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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
//*************************** Select class utils --html tag has to have <select> tag *******************************//	
	public void doSelectDropDownByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public void doSelectDropDownByValue(By locator, String value) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	public void doSelectDropDownByVisibleText(By locator, String text) {
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);
	}
//**************************non select class utils *********************************************************************************//
	public List<WebElement> getDropDownOptions(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions();
	}
	
	public int getTotalDropDownOptions(By locator) {
		System.out.println("Total options:: "+getDropDownOptions(locator).size());
		return getDropDownOptions(locator).size();
	}
	
	public List<String> getDropDownOptionTextList(By locator) {
		List<String> allText = new ArrayList<String>();
		List<WebElement> optionList = getDropDownOptions(locator);
		for(WebElement e : optionList) {
			allText.add(e.getText());
		}
		return allText;
	}
	
	public void selectFromDropDown(By locator, String option) {
		List<WebElement> optionList = getDropDownOptions(locator);
		for(WebElement e : optionList) {
			if(e.equals(option)) {
				e.click();
				break;
			}
		}
	}
//***********************Search utils************************************************//	
	public List<String> getAllSearchSuggestions(By searchbox, By searchresult, String searchtext) {
		doSendKeys(searchbox,searchtext);
		//Thread.sleep(3000);
		List<WebElement> searchResults = getElements(searchresult);
		List<String> searchResultTexts = new ArrayList<String>();
		for(WebElement e : searchResults) {
			searchResultTexts.add(e.getText());
		}
		return searchResultTexts;
	}
	
	public void clickOnResult(By searchbox, By searchresult, String searchtext, String result) {
		doSendKeys(searchbox,searchtext);
		//Thread.sleep(3000);
		List<WebElement> searchResults = getElements(searchresult);
		for(WebElement e : searchResults) {
			if(e.getText().contains(result)) {
				e.click();
				break;
			}
		}
	}
}
