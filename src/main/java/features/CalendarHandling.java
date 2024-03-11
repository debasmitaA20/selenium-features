package features;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarHandling {
	public static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();
		String actualMonthYear = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		System.out.println(actualMonthYear);
		
		//selectDate("29");
		selectCalendarDate("12");
	}
	
	public static void selectDate(String day) {
		driver.findElement(By.xpath("//a[text()='"+day+"']")).click();
	}
	
	public static void selectCalendarDate(String day) {
		List<WebElement> days = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//a"));
		System.out.println("No. of days are.."+days.size());
		for(WebElement e : days) {
			System.out.println(e.getText());
			if(e.getText().equals(day)) {
				e.click();
				break;
			}
		}
	}

}
