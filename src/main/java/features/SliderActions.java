package features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderActions {
	static WebDriver driver; 
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/slider/");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		WebElement slider = driver.findElement(By.id("slider"));
		int width = slider.getSize().getWidth();
		Actions action = new Actions(driver);
		action.moveToElement(slider, -((width/2)-30), 0).click().build().perform();
		action.clickAndHold(slider).moveByOffset((width/2)-40, 0).clickAndHold().build().perform();

	}

}
