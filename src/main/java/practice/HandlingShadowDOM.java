package practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingShadowDOM {

	public static void main(String args[]) throws InterruptedException {
		WebDriver driver = new ChromeDriver();		
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;	
		Thread.sleep(10000);
		WebElement userName = (WebElement)js.executeScript("return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#kils\")");		
		userName.sendKeys("Shadow dom test");
	}
}
