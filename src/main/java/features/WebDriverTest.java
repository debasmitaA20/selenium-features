package features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTest {

	public static void main(String[] args) {		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\in1debad\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 

	}
}


//testing with Selenium 4.5.3 //IllegalStateException without setting any System.setProperty(.exe)
//After 4.6.0 : we do not need to configure System property