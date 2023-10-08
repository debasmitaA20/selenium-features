package features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextForTextField {

	public static void main(String[] args) {
		
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		WebElement fname = driver.findElement(By.id("input-firstname"));
		fname.sendKeys("poobycoco");
		
		String text_fname = fname.getText(); //the getText() only works for texts already aavailable on the dom.
		System.out.println("Fetching text..."+text_fname); 
		
		String attr_value_fname = fname.getAttribute("value");
		System.out.println("Fetching text..."+attr_value_fname); 
		
		WebElement lname = driver.findElement(By.id("input-lastname"));
		lname.sendKeys(null); //IllegalArgumentException -- null cannot be used with sendKeys()
	}

}
