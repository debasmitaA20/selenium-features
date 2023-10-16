package testng_features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonTest {

	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		System.out.println("Launching browser.");
		driver.get("https://www.amazon.de/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}
	
	@Test
	public void titleTest() {
		String actual = driver.getTitle();
		System.out.println(actual);
		String expected = "Amazon.de";
		Assert.assertTrue(actual.contains(expected));
	}
	
	@Test
	public void searchBarExitsTest() {
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		Assert.assertTrue(search.isDisplayed());
	}
	
	@Test
	public void signinLinkTest() {
		WebElement signin = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
		Assert.assertEquals(signin.getText(), "Hello, sign in");
	}
	
	@AfterTest
	public void tearDown() {
		System.out.println("Quitting browser.");
		driver.quit();
	}
}
