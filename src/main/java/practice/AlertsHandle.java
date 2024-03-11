package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsHandle {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		By jsAlert = By.xpath("//button[text()='Click for JS Alert']");
		By jsConfirm = By.xpath("//button[text()='Click for JS Confirm']");
		By jsPrompt = By.xpath("//button[text()='Click for JS Prompt']");
		
		driver.findElement(jsPrompt).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Hello");
		System.out.println(alert.getText());
		alert.accept();				
	}
}
