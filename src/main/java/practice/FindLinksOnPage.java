package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FindLinksOnPage {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		//to find all links :
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));		
		for(WebElement e : allLinks) {
			if(e.getAttribute("href").contains("advanced_search")) {
				System.out.println(e.getAttribute("href"));
				break;
			}
		}
	}
}
