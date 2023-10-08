package features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLocator {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//driver.findElement(By.xpath("////[@id='input-firstname']")).sendKeys("debasmita"); //InvalidSelectorException -- invalid selector
		
		driver.findElement(By.xpath("//input[@id='incorrectvalue']")).sendKeys("debasmita"); //NoSuchElementException 
		
		//NoSuchElementException  extends NotFoundException
		//NotFoundException extends WebDriverException
		//WebDriverException extends RuntimeException
		//RuntimeException extends Exception
		//Exception extends Throwable
		

	}

}
