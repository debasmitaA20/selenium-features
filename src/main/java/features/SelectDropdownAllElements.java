package features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownAllElements {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://orangehrm.com/en/30-day-free-trial");

		By country = By.id("Form_getForm_Country");
		
		Select select = new Select(driver.findElement(country));
		List<WebElement> countryOps = select.getOptions();
		System.out.println("No.of options-- "+countryOps.size());
		
		for(WebElement e : countryOps) {
			//System.out.println(e.getText());
			//System.out.println(e.getAttribute("value"));
			if(e.getText().equals("Brazil")) {
				e.click();
				break;
			}
		}
		
		if(getTotalDropDownOptions(country)-1==232) {
			System.out.println("Country options are present.");
		}
		//to sort the list
		List<String> actual_ele = getDropDownOptionTextList(country);
		Collections.sort(actual_ele);
		
		List<String> expectedCountryList = Arrays.asList("India", "Norway", "Belgium");
		if(getDropDownOptionTextList(country).containsAll(expectedCountryList)) {
			System.out.println("Country options are present.");
		}

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static List<WebElement> getDropDownOptions(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions();
	}
	
	public static int getTotalDropDownOptions(By locator) {
		System.out.println("Total options:: "+getDropDownOptions(locator).size());
		return getDropDownOptions(locator).size();
	}
	
	public static List<String> getDropDownOptionTextList(By locator) {
		List<String> allText = new ArrayList<String>();
		List<WebElement> optionList = getDropDownOptions(locator);
		for(WebElement e : optionList) {
			allText.add(e.getText());
		}
		return allText;
	}
	
	public static void selectFromDropDown(By locator, String option) {
		List<WebElement> optionList = getDropDownOptions(locator);
		for(WebElement e : optionList) {
			if(e.equals(option)) {
				e.click();
				break;
			}
		}
	}
}
