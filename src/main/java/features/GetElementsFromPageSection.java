package features;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementsFromPageSection {
	public static WebDriver driver;
    
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		By rightPanel = By.xpath("//aside[@id='column-right']//a"); // "//" for indirect association
		By footerLinks = By.xpath("//footer//ul//a");
		
		System.out.println(getElementTextList(rightPanel));
		System.out.println(getElementTextList(footerLinks));

	}
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	public static List<String> getElementTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleText = new ArrayList<String>();
		for(WebElement e : eleList) {
			eleText.add(e.getText());
		}	
		System.out.println("Count of elements in list:: "+eleText.size());	
		return eleText;
	}

}
