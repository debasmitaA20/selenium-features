package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAPI {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://orangehrm.com/en/30-day-free-trial");
		
		By country = By.id("Form_getForm_Country");
		Select select = new Select(driver.findElement(country));
		List<WebElement> countryOps = select.getOptions();
		System.out.println("Number of countries : " + countryOps.size());
		
		select.selectByVisibleText("Bulgaria");
		
		driver.get("https://www.wikipedia.org/");	
		List<WebElement> languages = driver.findElements(By.xpath("//select/option"));
		
		for(WebElement e : languages) {
			if(e.getAttribute("value").equals("ar")) {
				e.click();
			}
		}
	}

}
