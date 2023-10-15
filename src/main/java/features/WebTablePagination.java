package features;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePagination {
	   static WebDriver driver;
		
		public static void main(String[] args) throws InterruptedException {
			
			driver = new ChromeDriver();
			
			driver.get("https://selectorshub.com/xpath-practice-page/");
			
			
			  while(true) { //infinite loop
			  if(driver.findElements(By.xpath("//td[text()='India']")).size()>0) { //It won't throw any exceptions selectCountry("India"); break; }else {
			  //pagination logic 
			 WebElement next = driver.findElement(By.linkText("Next"));
			  
			  if(next.getAttribute("class").contains("disabled")) {
			  System.out.println("Pagination is over..country not found.."); break; }
			  next.click(); Thread.sleep(1000); } }
			 
			
			multiSelectCountry("India");

	}

		private static void multiSelectCountry(String string) {
			// TODO Auto-generated method stub
			
		}

		private static void selectCountry(String countryName) {
			//td[text()='Denmark']/preceding-sibling::td[@class='column-1']/input[@type='checkbox']
			driver.findElement(By.xpath("//td[text()='"+countryName+"']/preceding-sibling::td[@class='column-1']/input[@type='checkbox']")).click();
			
		}
		


}
