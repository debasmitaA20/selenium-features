package testng_features;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	
	@Test(expectedExceptions=ArithmeticException.class)
	public void loginTest() {
		System.out.println("Login test..");
		int i = 9/0;
	}

}
