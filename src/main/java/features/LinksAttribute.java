package features;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksAttribute {
	 public static WebDriver driver;
	    
		public static void main(String[] args) {
			driver = new ChromeDriver();
			driver.get("https://www.amazon.de");
			
			By links = By.tagName("a");
			By images = By.tagName("img");
			
			//web scraping
			//System.out.println(allLinks.size());
			/*
			 * for(WebElement e : allLinks) { System.out.println(e.getAttribute("href")+
			 * " ------ "+ e.getText()); }
			 */
			//System.out.println(allImgs.size());
			List<String> imgAlt = getElementAttributes(images, "alt");
			System.out.println(imgAlt);
			System.out.println(imgAlt.size());
			
			List<String> linksHref = getElementAttributes(links, "href");
			System.out.println(linksHref);
			System.out.println(linksHref.size());

	}
		
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static List<String> getElementAttributes(By locator, String attributeName) {
		List<String> attributeValue = new ArrayList<String>();
		List<WebElement> elementList = getElements(locator);
		for(WebElement e : elementList) {
			attributeValue.add(e.getAttribute(attributeName));
		}
		return attributeValue;
	}

}
