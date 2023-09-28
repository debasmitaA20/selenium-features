package features;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {
	//find all the links on the page
	//print the total count of links
	//print the text of the links
	
    public static WebDriver driver;
    
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.amazon.de");
		
		//find all the links
		List<WebElement> links = driver.findElements(By.tagName("a"));
		//total count
		int linkcount = links.size();
		System.out.println("Total number of links available on the page:: "+ linkcount);
		//print text of each link
		int count = 0;
		for(WebElement e : links) {
			if(e.getText().length()>0) {
				System.out.println(count + ": "+e.getText());
			}
			count++;
		}

	}

}
//DOM is loaded first, then the page.
//But the links will start printing only when the page starts to load