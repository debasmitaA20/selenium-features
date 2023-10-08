package features;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PseudoElementConcept {

	public static void main(String[] args) {
		
		//window.getComputedStyle(document.querySelector("label[for='input-firstname']"), '::before').getPropertyValue('content') 
		//xpath will not work
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String script = "return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"), '::before').getPropertyValue('content')";
		
		String mandatory_field = js.executeScript(script, "").toString();
		
		System.out.println(mandatory_field);
		
		if(mandatory_field.contains("*")) {
			System.out.println("It is a mandatory field.");
		}
	}

}
