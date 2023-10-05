package features;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTableHandle {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.findElement(By.id("accept-choices")).click();
		
		System.out.println(getTableHeaderCount());
		System.out.println(getRowCount());
		System.out.println(getCompanyNames());
		System.out.println(getCountryNames());
		
		//table[@id='customers']/tbody/tr[2]/td[1]
		//table[@id='customers']/tbody/tr[3]/td[1]
		//table[@id='customers']/tbody/tr[4]/td[1]
		//table[@id='customers']/tbody/tr[5]/td[1]
		//table[@id='customers']/tbody/tr[6]/td[1]
		//table[@id='customers']/tbody/tr[7]/td[1]
		

	}
	
	public static int getTableHeaderCount() {
		return driver.findElements(By.xpath("//table[@id = 'customers']//th")).size();
	}
	
	public static int getRowCount() {
		return driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
	}
	
	public static List<String> getCompanyNames() {
		//table[@id='customers']/tbody/tr[2]/td[1]
		List<String> companyNames = new ArrayList<String>();	
		for(int i=2; i<=getRowCount();i++) {
			companyNames.add(driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td[1]"))
					.getText());	
		}
		return companyNames;
	}
	
	public static List<String> getCountryNames(){
		//table[@id='customers']/tbody/tr[2]/td[3]
		List<String> countryNames = new ArrayList<String>();	
		for(int i=2; i<=getRowCount();i++) {
			countryNames.add(driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+i+"]/td[3]"))
					.getText());	
		}
		return countryNames;
	}
	

}
