package features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowHandle {
//newWindowHandle() -- Selenium 4> WindowType.TAB or WindowType.WINDOW
    static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://debasmitaa-osondemand.orangehrm.com/symfony/web/index.php/auth/login");
		String window = driver.getWindowHandle();
		//driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.google.com");
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(window);
		System.out.println(driver.getCurrentUrl());
		driver.quit();

		//random pop up-- can't be handled/automated as we have no idea when it's coming
		//it is better to block these pop ups in lower env- qa/uat. these ad pop up for prod env.
		//Alerts and windows at once - Alerts freeze browser window. This scenario is not possible.
	}

}
