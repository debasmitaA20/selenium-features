package features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpathConcept {
//xpath - address of the element in html dom
	//absolute xpath:
	//relative xpath: custom xpath
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart");
		
		//tag[@attribute='value']
		//input[@id='input-email']
		////input[@placeholder='E-Mail Address']
		
		//tag[@attribute1='value' and @attribute2='value']
		//input[@type='text' and @name='email']
		
		//tag (entire page)
		//input -all input type fields
		//a - all links
		//img - all images
		
		//tag[@attribute1='value' or @attribute2='value']
		
		//xpath with text function
		//tag[text()='textvalue']
		//h2[text()='Returning Customer']
		//a[text()='Register'] - 2 elements
		
		//text() and attribute
		//tag[@attribute='value' and text()='']
		
		//tag[@attribute1='value' and @attribute2='value' and text()='']
		
		//url value
		//a[@href]
		
		//contains() with attribute
		//tag[contains(@attribute,'value')]
		//input[contains(@placeholder,'E-Mail')] //instead of complete 'E-Mail Address'
		
		//contains() with one attribute + one attribute without contains
		//input[contains(@placeholder,'E-Mail') and  @name='email']

		//dynamic attribute : here we can use contains()
		//input[@id = 'first_name123']
		//input[@id = 'first_name121']
		//input[@id = 'first_name109']
		//input[contains(@id,'first_name')]
		
		//contains() with text()
		//tag[contains(text(),'value')]
		//p[contains(text(),'marketing,sales,support')]
		//a[contains(text(),'Amazon')] --16
		
		//contains() with text() and contains() with attribute
		//tag[contains(text(),'value') and contains(@attribute,'value')]
		//a[contains(text(),'Amazon') and contains(@href,'amazon.science')]
		
		//contains() with text() and attribute with value
		//tag[contains(text(),'value') and @attribute='value']
		//a[contains(text(),'Science') and @href='https://www.amazon.science']
		
		//starts-with() with text() : can be used for paragraphs
		//tag[starts-with(text(),'value')]
		//a[starts-with(text(),'Amazon')] -- 11
		
		//ends-with() in xpath --NA
		
		//position/index in xpath
		// (//input[@class='form-control'])[2]
		By.xpath("(//input[@class='form-control'])[2]"); //(//input[@class='form-control']) -- capture group
		// (//input[@class='form-control'])[position()=2]
		
		// (//input[@class ='form-control']) -- 6 
		//last() -- last element
		// (//input[@class ='form-control'])[last()]
		//Help link on Amazon footer section - (//div[contains(@class,'navFooterLinkCol')])[last()]//li[last()]
		
		driver.findElement(By.xpath("//div[contains(@class,'navFooterLinkCol')])[last()]//li[last()]")).getText();
		
		//class in locator : classname, xpath, css
		//input[@class='form-control private-form__control login-email']
		//input[@class='login-email'] -- not valid
		//By.className("form-control private-form__control login-email"); -- not valid
		//By.className("login-email"); -- valid
		//By.className("//input[contains(@class,'login-email')]"); -- valid
		
		//parent to child
		// parent/child --direct
		// parent//child --direct + indirect
		
		//backward traversing
		//input[@id='input-email']/../../../../../../../../../../ --upto <html>
		
		//preceding-sibling
		//input[@id='input-email']/preceding-sibling::label
		By email_label = By.xpath("//input[@id='input-email']/preceding-sibling::label");
		String email_label_text = driver.findElement(email_label).getText();
		
		//label[@id='input-email']
		
		//following-sibling
		//label[@for='input-email']/following-sibling::input 
		//label[@for='input-email']/following-sibling::input[@name='email']
		//xpath/parent::<parenttag>

	}

}
