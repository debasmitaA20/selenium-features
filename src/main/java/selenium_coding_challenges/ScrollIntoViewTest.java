package selenium_coding_challenges;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollIntoViewTest {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.t-mobile.com/cell-phones?INTNAV=tNav:Devices:CellPhones");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement filterText = driver.findElement(By.xpath("(//h2[contains(@class,'heading-5')])[2]"));
		js.executeScript("arguments[0].scrollIntoView(true)", filterText);
		filterText = driver.findElement(By.xpath("(//h2[contains(@class,'heading-5')])[2]"));
		System.out.println(filterText.getText());

		List<WebElement> allFilters = driver.findElements(
				By.xpath("//div[@class='filters']//fieldset[@class='ng-star-inserted']//mat-panel-title//legend"));
		js.executeScript("arguments[0].scrollIntoView(true)", filterText);
		int filterSize = allFilters.size();
		System.out.println(filterSize);

		// WebElement deals =
		// driver.findElement(By.xpath("(//div[@class='filters']//fieldset[@class='ng-star-inserted']//mat-panel-title//legend)[1]"));

		// js.executeScript("arguments[0].scrollIntoView(true)", deals);
		// System.out.println(deals.getText());
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		// wait.until(ExpectedConditions.elementToBeClickable(deals));
		// boolean checkIfStale = ExpectedConditions.stalenessOf(deals).apply(driver);
		// System.out.println(checkIfStale);

		List<String> filterNames = new ArrayList<String>();

		for (int i = 1; i <= filterSize; i++) {
			WebElement ele = driver.findElement(
					By.xpath("(//div[@class='filters']//fieldset[@class='ng-star-inserted']//mat-panel-title//legend)["
							+ i + "]"));
			js.executeScript("arguments[0].scrollIntoView(true)", ele);
			filterNames.add(ele.getText());
		}
		System.out.println(filterNames);

		clickOnFilter("Deals");
		String filterIconXpath = "//div[@class='filters']//fieldset[@class='ng-star-inserted']//mat-panel-title//tmo-icon[contains(@class,'icon-dormant')]";
	}

	public static void clickOnFilter(String filterName) {

		//String customXpath = "//div[@class='filters']"
		//		+ "//fieldset[@class='ng-star-inserted']//mat-panel-title"
		//		+ "//tmo-icon[contains(@class,'icon-dormant')]"
		//		+ "//preceding-sibling::legend[text()=' " +filterName+ " ']";
		String customXpath = "//legend[text()=' "+ filterName +" ']//following-sibling::tmo-icon";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.xpath(customXpath)));
		driver.findElement(By.xpath(customXpath)).click();
	}
}
