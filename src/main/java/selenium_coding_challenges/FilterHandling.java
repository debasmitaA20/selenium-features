package selenium_coding_challenges;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FilterHandling {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.t-mobile.com/cell-phones?INTNAV=tNav:Devices:CellPhones");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
		
		allFilters();
		//clickOnAFilter();

	}
	
	public static void allFilters() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement filter = driver.findElement(By.xpath("//div[@class='filters']"));
		js.executeScript("arguments[0].scrollIntoView(true);", filter);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		List<WebElement> filters = wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//div[@class='filters']//fieldset[@class='ng-star-inserted']//mat-panel-title//legend"))));
		
		List<String> filterNames = new ArrayList<>();
		System.out.println(filters.size());
		for(WebElement e : filters) {
			filterNames.add(e.getText());
		}
		
		System.out.println(filterNames);
		
	}
	
	public static void selectFilter(String... filterName) {
		
	}
	
	public static void clickOnAFilter() {
		JavascriptExecutor js = (JavascriptExecutor)driver;	
		
		String filterXpath = "//div[@class='filters']//fieldset[@class='ng-star-inserted']//mat-panel-title//legend[text()=' Deals ']";
		String filterIconXpath = "//div[@class='filters']//fieldset[@class='ng-star-inserted']//mat-panel-title//tmo-icon[contains(@class,'icon-dormant')]";
		
		js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath(filterXpath)));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(filterIconXpath)))).click();
		
	}

}
