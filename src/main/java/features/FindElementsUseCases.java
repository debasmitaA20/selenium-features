package features;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsUseCases {
	 public static WebDriver driver;
	    
		public static void main(String[] args) {
			driver = new ChromeDriver();
			driver.get("https://www.amazon.de");
			
			By links = By.tagName("a");
			if(getElementsCount(links)>100) {
				System.out.println("passed");
			}
	}

		public static List<WebElement> getElements(By locator) {
			return driver.findElements(locator);
		}
		
		public static int getElementsCount(By locator) {
			int count = getElements(locator).size();
			System.out.println("Total element count for :: "+locator + "---> "+count);
			return count;
		}
}
