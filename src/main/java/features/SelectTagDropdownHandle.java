package features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTagDropdownHandle {

	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://orangehrm.com/en/30-day-free-trial");

		By country = By.id("Form_getForm_Country");
		//dropdown -- htmltag -- <select>
		//Use Select class
		WebElement countryEle = driver.findElement(country);
		Select select = new Select(countryEle); //Select constructor takes WebElement as argument
		//select.selectByIndex(5); //byIndex - can used when values are constant
		//select.selectByValue("India"); //byValue - fetch the "value" attribute of the <option> tag
		//<option value="Afghanistan">Afghanistan
		select.selectByVisibleText("Belgium"); //byVisibleText - if value attribute is not available
		
		
	}

}
