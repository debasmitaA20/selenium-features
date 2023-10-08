package features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledTextFieldButtonEnterValue {

	public static void main(String[] args) {
		
		//for text field attribute disabled="disabled" -- ElementNotInteractableException
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://classic.freecrm.com/register/");
		driver.findElement(By.id("submitButton")).click(); //ElementClickInterceptedException

	}

}
