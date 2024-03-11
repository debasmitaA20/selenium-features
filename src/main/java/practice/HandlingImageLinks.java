package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingImageLinks {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.amazon.de/");
		List<WebElement> allImages = driver.findElements(By.tagName("img"));
		System.out.println("Total images : " + allImages.size());

		for(WebElement e : allImages) {
			System.out.println("Image name :: " + e.getAttribute("alt") + " ======= " +
					           "Image source :: " + e.getAttribute("src"));
		}
	}

}
