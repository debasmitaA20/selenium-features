package features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPageTest {
	
	public static void main(String[] args) {
		
		String browsername = "firefox";
	
		BrowserUtil util = new BrowserUtil();
		WebDriver driver = util.initDriver(browsername);
		util.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		System.out.println("Page title is :: "+ util.getPageTitle());
		
		//by locators : Object repository
		By firstname = By.id("input-firstname");
		By lastname = By.id("input-lastname");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By confirm_pass = By.id("input-confirm");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		
		eleUtil.doSendKeys(firstname, "debasmita");
		eleUtil.doSendKeys(lastname, "adhikari");
		eleUtil.doSendKeys(email, "test909@gamil.com");
		eleUtil.doSendKeys(telephone, "345677899");
		eleUtil.doSendKeys(password, "test123");
		eleUtil.doSendKeys(confirm_pass, "test123");
		
		
		
		
		
		
	}
}
