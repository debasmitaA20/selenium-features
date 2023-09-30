package features;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLanguageLinks {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		By googleAgreeButton = By.xpath("//button[@id='L2AGLb']");
		By googleLangLinks = By.xpath("//div[@id='SIvCob']/a");
		By googleFooterLinks = By.xpath("//div[@class ='KxwPGc SSwjIe']//a");
		
		googleAgreeAllButton(googleAgreeButton);
		System.out.println(getGoogleLanguageList(googleLangLinks));
		selectAGooglelanguage(googleLangLinks, "English");
		System.out.println(getAllFooterLinks(googleFooterLinks));
		System.out.println(getGoogleLanguageList(googleLangLinks));
		
	}
	//google agree button
	//list of footer links
	//list of lang links
	//select a language
	public static void googleAgreeAllButton(By locator) {
		driver.findElement(locator).click();
	}
	
	public static List<String> getGoogleLanguageList(By locator) {
		List<WebElement> languageList = driver.findElements(locator);
		List<String> languages = new ArrayList<String>();
		for(WebElement e : languageList) {
			languages.add(e.getText());
		}
		return languages;
	}
	
	public static void selectAGooglelanguage(By locator, String lang) {
		List<WebElement> languageList = driver.findElements(locator);
		for(WebElement e : languageList) {
			if(e.getText().equals(lang)) {
				e.click();
				break;
			}
		}	
	}
	
    public static List<String> getAllFooterLinks(By locator) {
    	List<WebElement> footerLinksList = driver.findElements(locator);
    	List<String> footerLinks = new ArrayList<String>();
    	for(WebElement e : footerLinksList) {
    		footerLinks.add(e.getText());
		}
		return footerLinks;	
   }


}
