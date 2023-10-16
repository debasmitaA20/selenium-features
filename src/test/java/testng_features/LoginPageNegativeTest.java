package testng_features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageNegativeTest {
    public WebDriver driver;
    
	public boolean doLogin(String username, String password) {
		By warningMsg = By.xpath("//div[contains(@class,'alert')]");
		
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		String msg = driver.findElement(warningMsg).getText();
		System.out.println(msg);
		
		if(msg.contains("Warning: No match for E-Mail Address and/or Password.")) {
			return true;
		}
		return false;
	}
	@DataProvider
	public Object[][] loginNegativeTestData() { //data driven approach
		return new Object[][] {
			{"debasmita123!gmail.com", "test@123"},
			{"debasmita122!gmail.com", "test@123"},	
			{"debasmita122!gmail.com", "test@1"}
		};
	}
	@BeforeTest
	public void setUp() {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	}
	@Test(dataProvider = "loginNegativeTestData")
	public void doLoginTest(String username, String pass) {
		Assert.assertTrue(doLogin(username,pass));
	}
}
