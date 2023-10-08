package features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IFrameHandle {
	
    static WebDriver driver;
	
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		
		driver.findElement(By.xpath("//img[contains(@title,'Vehicle-Registration-Forms-and-Examples')]")).click();
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame-one748593425']")));
		
		By proposalTitle = By.id("RESULT_TextField-1");
		By location = By.id("RESULT_TextField-3");
		By description = By.id("RESULT_TextArea-5");
		By fileUpload = By.id("RESULT_FileUpload-6");
		
		By firstname = By.id("RESULT_TextField-8");
		By lastName = By.id("RESULT_TextField-9");
		By streetAdd = By.id("RESULT_TextField-10");
		By city = By.id("RESULT_TextField-12");
		By stateDropdown = By.id("RESULT_RadioButton-13");
		By zip = By.id("RESULT_TextField-14");
		By phone = By.id("RESULT_TextField-15");
		By email = By.id("RESULT_TextField-16");
		By submitbtn = By.id("FSsubmit");	
		By propsedDate = By.id("RESULT_TextField-4");
		
		doSendKeys(proposalTitle,"Test Title");
		doSendKeys(location,"Lucknow");
		doSendKeys(propsedDate,"10/12/2023");
		doSendKeys(description,"Test description");
		doSendKeys(fileUpload,"C:\\Users\\91956\\Downloads\\sixOfcrows.jpg");
		doSendKeys(firstname,"Test FName");
		doSendKeys(lastName,"Test LName");
		doSendKeys(streetAdd,"Test Street address");
		doSendKeys(city,"Dallas");
		
		Select select = new Select(driver.findElement(stateDropdown));
		select.selectByVisibleText("Texas");
		
		doSendKeys(zip,"23456");
		doSendKeys(phone,"6677889933");
		doSendKeys(email,"testemail@gmail.com");
		driver.findElement(submitbtn).click();
		
		System.out.println("Form submitted..");
			

	}
	
	public static void doSendKeys(By locator, String keys) {
		driver.findElement(locator).sendKeys(keys);
	}

}
