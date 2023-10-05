package features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopupHandle {
public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/upload");
		//this works only for - <tag type='file'>
		driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\in1debad\\Desktop\\Filetest.txt");
		driver.findElement(By.id("file-submit")).click();

		//not recommended-
		//autoIT - only for windows
		//Sikuli - 
	}

}
