package features;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTablePagination {
	   static WebDriver driver;
		
		public static void main(String[] args) throws InterruptedException {
			
			driver = new ChromeDriver();
			
			driver.get("https://selectorshub.com/xpath-practice-page/");
			
			
			  //while(true) { //infinite loop
			 // if(driver.findElements(By.xpath("//td[text()='India']")).size()>0) { //It won't throw any exceptions selectCountry("India"); break; }else {
			  //pagination logic 
			 //WebElement next = driver.findElement(By.linkText("Next"));
			  
			 // if(next.getAttribute("class").contains("disabled")) {
			  //System.out.println("Pagination is over..country not found.."); break; }
			  //next.click(); Thread.sleep(1000); } }
			
			WebElement next = driver.findElement(By.linkText("Next"));
			while(true) {
				if(driver.findElements(By.xpath("//td[text()='India']")).size()>0) {
						multiSelectCountry("India");	
				}
				//pagination--
				if(next.getAttribute("class").contains("disabled")) {
					System.out.println("No more pages available..");
				}
				next.click();
			}
			
		}

		private static void multiSelectCountry(String countryName) {
			//td[text()='India']/preceding-sibling::td/input[@type='checkbox']
			
			List<WebElement> countries = driver.findElements(By.xpath("(//td[text()='"+countryName+"'])/preceding-sibling::td[@class='column-1']/input[@type='checkbox']"));
			for(WebElement e : countries) {
				e.click();
			}
			
		}

		private static void selectCountry(String countryName) {
			driver.findElement(By.xpath("//td[text()='"+countryName+"']/preceding-sibling::td[@class='column-1']/input[@type='checkbox']")).click();
			
		}
		


}
