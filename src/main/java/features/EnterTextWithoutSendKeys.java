package features;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterTextWithoutSendKeys {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		WebElement searchBox = driver.findElement(By.name("q"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='selenium'",searchBox);
		searchBox.submit();

	}

}
