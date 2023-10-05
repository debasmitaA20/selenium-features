package features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandle {

	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.classic.crmpro.com");
		Thread.sleep(4000);
		driver.findElement(By.name("username")).sendKeys("newautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(4000);
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();
		driver.findElement(By.xpath("//a[text()='Ali Khan']/parent::td/preceding-sibling::td/input[@type='Checkbox']")).click();
		
		//Orange-hrm : (//a[text()='Debasmita']/parent::td/preceding-sibling::td)[2] -- profile id
		//a[text()='Debasmita']/parent::td/following-sibling::td/a -- last name
		
		selectUser("Ali Khan");
		selectUser("deepti gupta");
		
		String cName = getUserCompanyname("Ali Khan");
		System.out.println(cName);
		cName = getUserCompanyname("Romi singh");
		System.out.println(cName);
		
		 
	}
	
	public static void selectUser(String username) {
		//a[text()='Ali Khan']/parent::td/preceding-sibling::td/input[@type='Checkbox']
		//"//a[text()='"+username+"']/parent::td/preceding-sibling::td/input[@type='Checkbox']" --- Dynamic xpath
		driver.findElement(By.xpath("//a[text()='"+username+"']/parent::td/preceding-sibling::td/input[@type='Checkbox']\"")).click();;
	}
	
	public static String getUserCompanyname(String username) {
		//a[text()='Ali Khan']/parent::td/following-sibling::td/a[@context='company']
		//"a[text()='+username+"']/parent::td/following-sibling::td/a[@context='company']
		return driver.findElement((By.xpath("//a[text()='"+username+"']/parent::td/following-sibling::td/a[@context='company']"))).getText();
	}

}
