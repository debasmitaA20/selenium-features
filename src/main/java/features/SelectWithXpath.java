package features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectWithXpath {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.microchip.com/prochiplicensing/#/");
		WebElement prodYear = driver.findElement(By.id("productionYear"));
		Select select = new Select(prodYear);
		select.selectByValue("2023");
		
		//label[text()='When is your design planned for production?']/preceding-sibling::select
		

	}

}
