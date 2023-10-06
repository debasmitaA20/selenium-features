package features;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandle {
	
    static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://debasmitaa-osondemand.orangehrm.com/symfony/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//img[contains(@alt,'OrangeHRM on twitter')]")).click();
		//Set collection - elements are not stored in sorted manner
		//Which window is opened first depends on driver- and likewise the windowHandleIds are stored
		
		//get the window handle id:
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		
		String parentWindowId = it.next();
		System.out.println("Parent window id "+parentWindowId);
		
		String childWindowId = it.next();
		System.out.println("Child window id "+childWindowId);
		
		//switch to window :
		driver.switchTo().window(childWindowId); 
		System.out.println("Child window url: "+driver.getCurrentUrl());
		driver.close();//driver doesn't go back to parent window automatically -- NoSuchWindowException
		driver.switchTo().window(parentWindowId);
		System.out.println("Parent Window url: "+driver.getCurrentUrl());
		driver.quit();

	}

}
