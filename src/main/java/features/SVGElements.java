package features;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElements {

	static WebDriver driver; 
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map/");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
		
		String svgEle = "//*[local-name()='svg'and @id='map-svg']//*[name()='g' and @id='region']//*[name()='path']";
		
		List<WebElement> states = driver.findElements(By.xpath(svgEle));
		
		System.out.println(states.size());
		
		for(WebElement e : states) {
			String stateName = e.getAttribute("name");
			System.out.println(stateName);
		}
		
		
	}

}
