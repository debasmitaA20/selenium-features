package features;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricInfoTable {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/asian-games-men-s-cricket-competition-2023-1398685/bangladesh-vs-malaysia-4th-quarter-final-1399116/full-scorecard");
		Thread.sleep(4000);
		//driver.switchTo().frame("CMP Locator");
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		//driver.switchTo().defaultContent();
		//button[@id='onetrust-accept-btn-handler']
		String bowlerName = getWicketTakerName("Zakir Hasan");
		System.out.println(bowlerName);
		bowlerName = getWicketTakerName("Shahadat Hossain");
		System.out.println(bowlerName);
		
		System.out.println(getScoreCardist("Zakir Hasan"));
	}
	
	public static String getWicketTakerName(String batsmanName) {
		//span[text()='Zakir Hasan']/ancestor::td/following-sibling::td/span/span
		return 
				driver.findElement(By.xpath("//span[text()='"+batsmanName+"']/ancestor::td/following-sibling::td/span/span"))
				.getAttribute("innerText");	
	}
	
	public static List<String> getScoreCardist(String playername) {
		//span[text()='c Anwar Rahman b Pavandeep Singh']/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]
		List<WebElement> scoreList = 
				driver.findElements(By.xpath("//span[text()='"+playername+"']/ancestor::td/following-sibling::td[contains(@class,'ds-text-right')]"));
		List<String> playerScoreList = new ArrayList<String>();
		for(WebElement e : scoreList) {
			playerScoreList.add(e.getText());
		}
		return playerScoreList;
	}

}
