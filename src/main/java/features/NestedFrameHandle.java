package features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameHandle {
    static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		
		driver.get("https://selectorshub.com/iframe-scenario/");
		
		driver.switchTo().frame("pact1");
		driver.findElement(By.id("inp_val")).sendKeys("terry");
		
		driver.switchTo().frame("pact2");
		driver.findElement(By.id("jex")).sendKeys("jake");
		
		driver.switchTo().frame("pact3");	
		driver.findElement(By.id("glaf")).sendKeys("taylor swift");
		

	}

}
