package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassUse {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		//find main menu By locator
		WebElement shopMenu = driver.findElement(By.xpath("(//button[contains(@class,'content-center')])[2]"));
		//create Actions class object
		Actions action = new Actions(driver);
		//click on the main menu
		action.click(shopMenu).build().perform();
		Thread.sleep(2000);
		//find the sub menu item elements :
		WebElement kitchenMenu = driver.findElement(By.linkText("Kitchen, Garden & Pets"));
		action.moveToElement(kitchenMenu).build().perform();
		Thread.sleep(2000);
		WebElement steelUtensils = driver.findElement(By.linkText("Steel Utensils"));
		action.moveToElement(steelUtensils).build().perform();
		Thread.sleep(2000);
		WebElement bowls = driver.findElement(By.linkText("Bowls & Vessels"));
		action.click(bowls).build().perform();
	}

}
