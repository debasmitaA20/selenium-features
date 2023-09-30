package features;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
	
    static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		By googleAgreeButton = By.xpath("//button[@id='L2AGLb']");
		By searchbox = By.id("APjFqb");
		By searchResults = By.xpath("//div[@id='Alh6id']//li");
		
		googleAgreeAllButton(googleAgreeButton);
		List<String> results = getAllSearchSuggestions(searchbox,searchResults,"paradox theories ");
		System.out.println(results);
		
	}
//search a keyword and get all suggestions
	public static void googleAgreeAllButton(By locator) {
		driver.findElement(locator).click();
	}
	
	public static List<String> getAllSearchSuggestions(By searchbox, By searchresult, String searchtext) {
		driver.findElement(searchbox).sendKeys(searchtext);
		//Thread.sleep(3000);
		List<WebElement> searchResults = driver.findElements(searchresult);
		List<String> searchResultTexts = new ArrayList<String>();
		for(WebElement e : searchResults) {
			searchResultTexts.add(e.getText());
		}
		return searchResultTexts;
	}
	
	public static void clickOnResult(By searchbox, By searchresult, String searchtext, String result) {
		driver.findElement(searchbox).sendKeys(searchtext);
		//Thread.sleep(3000);
		List<WebElement> searchResults = driver.findElements(searchresult);
		for(WebElement e : searchResults) {
			if(e.getText().contains(result)) {
				e.click();
				break;
			}
		}
	}
}
