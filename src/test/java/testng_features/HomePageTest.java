package testng_features;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest {

	//global pre conditions
	//pre conditions
	//testcases -> teststeps ->atual vs expected - assertions
	//post steps
	//global post steps
	@BeforeSuite //1
	public void startDBConnections() {
		System.out.println("Start DB Connections.");
	}
	
	@BeforeTest //2
	public void createUser() {
		System.out.println("Create user before test.");
	}
	
	@BeforeClass //3  -- it will execute before test class
	public void launchBrowser() {
		System.out.println("Launch browser.");
	}
	
	@BeforeMethod //4 , 7-- it will execute before each and every test method - pick alphabetical order
	public void loginToApp() {
		System.out.println("Login to app.");
	}
	@Test //7
	public void loginTest() {
		System.out.println("Verify login success.");
	}
	@Test //5
	public void homepageTitleTest() {
		System.out.println("Verify homepage title.");
	}
	@Test //8
	public void homepageUrlTest() {
		System.out.println("Verify homepage url.");
	}
	
	@AfterMethod //-- it will execute after each and every test method  //6, 9
	public void logout() {
		System.out.println("Logout from app.");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Close browser.");
	}
	
	@AfterTest
	public void deleteUser() {
		System.out.println("Delete user after test.");
	}
	@AfterSuite
	public void endDBConnection() {
		System.out.println("End DB Connections.");
	}
	
	
	
	
	
	
	
}
