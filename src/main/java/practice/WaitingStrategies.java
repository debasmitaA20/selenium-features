package practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitingStrategies {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		FluentWait wait2 = new FluentWait(driver)
				              .withTimeout(Duration.ofSeconds(20))
				              .pollingEvery(Duration.ofSeconds(4));
		
		wait2.until(ExpectedConditions.alertIsPresent());
		

	}

}
