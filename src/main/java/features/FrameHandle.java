package features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	static WebDriver driver;
	
	public static void main(String[] args) {
		driver = new ChromeDriver();
		/*
		 * driver.get("https://the-internet.herokuapp.com/iframe"); int frameCount =
		 * driver.findElements(By.tagName("iframe")).size();
		 * System.out.println(frameCount); driver.switchTo().frame("mce_0_ifr");
		 * //NoSuchFrameException - if frame not found
		 * 
		 * 
		 * driver.findElement(By.id("tinymce")).clear();
		 * driver.findElement(By.id("tinymce")).sendKeys("My content.");
		 */
		
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		int frameCount = driver.findElements(By.xpath("//frame")).size();
		System.out.println(frameCount);

	}

}
