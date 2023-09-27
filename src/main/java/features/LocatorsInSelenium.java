package features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsInSelenium {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		//1.id
		//2.name : can be duplicate
		//By email = By.name("email");
		//3.classname : can be duplicate - multiple elements can belong to same class
		//By email = By.className("form-control"); //not unique
		//driver.findElement(email).sendKeys("debasmita@email.com");
		//use classname only if it is unique
		
		//4.xpath
		By email = By.xpath("//*[@id=\"input-email\"]");
		driver.findElement(email).sendKeys("testemail@gmail.com");
		
	}

}
