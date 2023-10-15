package features;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMHandle {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		
		//driver.findElement(By.id("pizza")).sendKeys("mushroom"); //NoSuchElementException 
		//shadow-dom is another layer in the dom like iframe/frames
		//browser->page->shadowDOM-> input element
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//covert Browser element to WebElement
		WebElement enterPizza = (WebElement)js.executeScript("return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")");	
		
		enterPizza.sendKeys("mushroom");
		
		//if application is full of shadow dowm- selenium is not the right choice for it

	}

}
