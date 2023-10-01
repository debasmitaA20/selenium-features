package features;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImages {
	 public static WebDriver driver;
	    
		public static void main(String[] args) {
			driver = new ChromeDriver();
			driver.get("https://www.amazon.de");
			//all images
			//List<WebElement> images = driver.findElements(By.tagName("img"));
			List<WebElement> images = driver.findElements(By.tagName("img11")); 
			//With findElements()-It will not throw any exception. And the size() will return 0
			//image count
			System.out.println("Total images on the page:: "+images.size());

			//findElement()-NoSuchElementException
			//findElements()-empty list , no action can be performed

	}

}
