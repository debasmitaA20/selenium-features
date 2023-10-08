package features;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickHandle { //right click == context click

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions action = new Actions(driver);
		action.contextClick(rightClick).build().perform();
		
		List<WebElement> menu = driver.findElements(By.xpath("//ul[contains(@class,'context-menu-list')]//li"));
		
		/*
		 * for(WebElement e : menu) { if(e.getText().equals("Edit")) {
		 * action.contextClick(e).build().perform(); driver.switchTo().alert().accept();
		 * break; } }
		 */
		for(WebElement e : menu) {
			if(!e.getText().equals("")) {
			action.contextClick(e).build().perform();
			System.out.println(driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();
			action.contextClick(rightClick).build().perform();
			}
		}

	}

}
