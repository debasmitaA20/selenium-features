package features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsPresent {
	public static WebDriver driver;
	public static void main(String[] args) {
        driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		By img = By.className("img-responsive11");//incorrect locator
		By searchBox = By.name("search");

		//boolean flag = driver.findElement(img).isDisplayed(); //it will return true
		boolean flag = driver.findElement(img).isDisplayed(); //it will throw an exception while trying to find the element on the page.
		//findElement(By by) will throw NoSuchElementException - while creating the element
		//There is no exception Selenium called as - ElementNotFoundException
	}

}
