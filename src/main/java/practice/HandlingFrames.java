package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");		
		//WebElement frameTop = driver.findElement(By.name("frame-top"));
		//driver.switchTo().frame(frameTop);
		driver.switchTo().frame("frame-top");
		List<WebElement> allFramesWithinTop = driver.findElements(By.xpath("//frame"));
		System.out.println("No.of inner frames :" + allFramesWithinTop.size());
		
		driver.switchTo().frame("frame-left");
		System.out.println(driver.findElement(By.xpath("//body")).getText());
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame("frame-middle");
		System.out.println(driver.findElement(By.xpath("//body")).getText());
		driver.switchTo().defaultContent();
		List<WebElement> allParentFrames = driver.findElements(By.xpath("//frame"));
		System.out.println("No.of parent frames :" + allParentFrames.size());
	}
}
