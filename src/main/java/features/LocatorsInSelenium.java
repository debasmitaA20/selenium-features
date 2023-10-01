package features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsInSelenium {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		//1.id : only attribute which is unique
		//2.name : can be duplicate
		//By email = By.name("email");
		//3.classname : can be duplicate - multiple elements can belong to same class
		//By email = By.className("form-control"); //not unique
		//driver.findElement(email).sendKeys("debasmita@email.com");
		//use classname only if it is unique
		
		//4.xpath : not an attribute
		By email = By.xpath("//*[@id=\"input-email\"]");
		driver.findElement(email).sendKeys("testemail@gmail.com");
		
		//5.css selector : not an attribute
		By password = By.cssSelector("#input-password");
		driver.findElement(password).sendKeys("test123");
		
		//6.linkText - only for links- html tag for links - <a> anchor tag, href property, Every link will have a text element <a href>text value</a>
		//can be duplicate- both redirect to same page
		//not an attribute 
		//text of the link
		By register = By.linkText("Register");
		driver.findElement(register).click();
		
		//7.prtialLinkText - only for links
		//not an attribute
		//text of the link
		By forgottenPass = By.partialLinkText("Forgotten");
		driver.findElement(forgottenPass).click();
		
		//8.tagName
		By textheader = By.tagName("h2");
		System.out.println(driver.findElement(textheader).getText());//getText() returns the visible text of the element
		
		
		//getText() - works for links, paragraph, headers, footer - any element has a text
		//click() - buttons, links, checkboxes, radiobuttons, images
		//sendKeys(String keys) - text fields, dropdown fields, fileupload
		
	}

}
