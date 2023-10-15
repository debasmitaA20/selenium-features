package features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketMultiLevelMenuHandling {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		By shopMenu = By.xpath("(//button[contains(@class,'content-center')])[2]");
		
		selectTheProductLevel4MenuHandling(shopMenu,"Beverages","Tea","Green Tea");

		//driver.close();
	}
	
	public static void selectTheProductLevel4MenuHandling(By locator, String l1, String l2, String l3) throws InterruptedException {
		
		Actions action = new Actions(driver);
		action.click(driver.findElement(locator)).build().perform();
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.linkText(l1))).build().perform();
		Thread.sleep(2000);
		action.moveToElement(driver.findElement(By.linkText(l2))).build().perform();
		Thread.sleep(2000);
		action.click(driver.findElement(By.linkText(l3))).build().perform();
	}

}
