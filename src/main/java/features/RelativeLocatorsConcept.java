package features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;


public class RelativeLocatorsConcept {

	static WebDriver driver;
	
	public static void main(String[] args) {
	//	        above
	//    near    
	//	   left    .   right
		   
      //          below
		
		//Selenium 4.x
		
		driver = new ChromeDriver();
		driver.get("https://aqi.in/dashboard/canada");
		
		WebElement baseEle = driver.findElement(By.linkText("Sherbrooke, Canada"));
		String rightIndexVal = driver.findElement(with(By.tagName("p")).toRightOf(baseEle)).getText();
		System.out.println(rightIndexVal);
		String rank = driver.findElement(with(By.tagName("p")).toLeftOf(baseEle)).getText();
		System.out.println(rank);
		String above = driver.findElement(with(By.tagName("p")).above(baseEle)).getText();
		System.out.println(above);
		String below = driver.findElement(with(By.tagName("p")).below(baseEle)).getText();
		System.out.println(below);
		
		String near = driver.findElement(with(By.tagName("p")).near(baseEle)).getText();
		System.out.println(near);
		
	}

}
