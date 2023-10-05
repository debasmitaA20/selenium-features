package features;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertJSPopup {

	//js alert - alert, prompt, confirm
	//auth popup
	//browser window popup
	//file upload popup
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		//if driver tries to switch to alert when there is no alert available:
		Alert alert = driver.switchTo().alert(); //NoAlertPresentException : no such alert
		Thread.sleep(3000);
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		alert = driver.switchTo().alert(); //NoAlertPresentException : no such alert
		Thread.sleep(3000);
		String textConfirm = alert.getText();
		System.out.println(textConfirm);
		alert.accept();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		alert = driver.switchTo().alert(); //NoAlertPresentException : no such alert
		Thread.sleep(3000);
		String textPrompt = alert.getText();
		System.out.println(textPrompt);
		alert.sendKeys("this is a JS prompt");
		alert.accept();
		//alert.dismiss();
		

	}

}
