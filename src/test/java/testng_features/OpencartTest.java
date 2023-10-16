package testng_features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpencartTest {
WebDriver driver;
	
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		System.out.println("Launching browser.");
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}
	
	@Test
	public void titleTest() {
		String actual = driver.getTitle();
		System.out.println(actual);
		String expected = "Account Login";
		Assert.assertTrue(actual.contains(expected));
	}
	
	@Test
	public void searchBarExitsTest() {
		WebElement search = driver.findElement(By.name("search"));
		Assert.assertTrue(search.isDisplayed());
	}
	
	@AfterTest
	public void tearDown() {
		System.out.println("Quitting browser.");
		driver.quit();
	}
}

