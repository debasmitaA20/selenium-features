package testng_features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest{

	@Test(priority=1)
	public void titleTest() {
		String actual = driver.getTitle();
		System.out.println(actual);
		String expected = "Google";
		Assert.assertTrue(actual.contains(expected));
	}
	
	@Test(priority=2)
	public void searchBarExitsTest() {
		WebElement search = driver.findElement(By.id("APjFqb"));
		Assert.assertTrue(search.isDisplayed());
	}

}