package features;

public class AmazonTest {

	public static void main(String[] args) {
		
		BrowserUtil br = new BrowserUtil();
		br.initDriver("chrome");
		br.launchURL("https://www.amazon.de");

	}

}
