package features;

public class AmazonTest {

	public static void main(String[] args) {
		
		BrowserUtils br = new BrowserUtils();
		br.initDriver("chrome");
		br.launchURL("https://www.amazon.de");

	}

}
