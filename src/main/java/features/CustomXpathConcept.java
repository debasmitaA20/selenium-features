package features;

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
		////a[starts-with(text(),'Amazon')] -- 11
		
		
		

	}

}
