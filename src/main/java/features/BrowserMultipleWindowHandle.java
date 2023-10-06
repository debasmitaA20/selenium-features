package features;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMultipleWindowHandle {

    static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://debasmitaa-osondemand.orangehrm.com/symfony/web/index.php/auth/login");
		
		String parentWindowId = driver.getWindowHandle();
		System.out.println(parentWindowId);
		//a<target = "_blank"> - this attribute value will open the link in new window
		WebElement linkedIn = driver.findElement(By.xpath("//img[contains(@alt,'LinkedIn OrangeHRM group')]"));
		WebElement twitter = driver.findElement(By.xpath("//img[contains(@alt,'OrangeHRM on twitter')]"));
		WebElement facebook = driver.findElement(By.xpath("//img[contains(@alt,'OrangeHRM on Facebook')]"));
		WebElement youtube = driver.findElement(By.xpath("//img[contains(@alt,'OrangeHRM on youtube')]"));
		
		linkedIn.click();
		System.out.println(driver.getWindowHandle());
		twitter.click();
		System.out.println(driver.getWindowHandle());
		facebook.click();
		System.out.println(driver.getWindowHandle());
		youtube.click();
		System.out.println(driver.getWindowHandle());
		
		Set<String> windowHandles = driver.getWindowHandles();		
		Iterator<String> it = windowHandles.iterator();
		
		while(it.hasNext()) {
			String window = it.next();
			driver.switchTo().window(window);
			System.out.println(driver.getCurrentUrl());
			if(!window.equals(parentWindowId)) {
			driver.close();
			}
		}	
		driver.switchTo().window(parentWindowId);
		driver.quit();
		
	}

}
