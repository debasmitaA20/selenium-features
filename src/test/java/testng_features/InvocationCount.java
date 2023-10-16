package testng_features;

import org.testng.annotations.Test;

public class InvocationCount { //can used to create load test e.g. search same products many times

	@Test(invocationCount=10)
	public void createUserTest() {
		System.out.println("Creating users..");
	}
}
