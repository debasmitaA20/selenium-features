package features;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {

	public static void main(String[] args) throws InterruptedException {
		
		//By.linkText() -- visible text on page
		//a[normalize-space()] -- function in xpath to remove spaces from text from an element
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://mrbool.com/");
		WebElement menu = driver.findElement(By.cssSelector("a.menulink"));
		
		Actions action = new Actions(driver);
		action.moveToElement(menu).build().perform();
		
		List<WebElement> submenu = driver.findElements(By.xpath("//a[@class='menulink']/following-sibling::ul//a"));
		for(WebElement e : submenu) {
			System.out.println(e.getText());
		}
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		action.moveToElement(driver.findElement(By.xpath("//div[text()='Add-ons']"))).build().perform();
		
		submenu = driver.findElements(By.xpath("//div[@class='css-76zvg2 r-homxoj r-ubezar']"));
		for(WebElement e : submenu) {
			System.out.println(e.getAttribute("innerText"));
		}
		
		
	}

}
