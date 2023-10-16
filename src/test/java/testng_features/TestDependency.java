package testng_features;

import org.testng.annotations.Test;

public class TestDependency {

	@Test
	public void searchTest() {
		System.out.println("Search a product.");
		int i = 9/0;
	}
	@Test(dependsOnMethods="searchTest")
	public void addToCartTest() {
		System.out.println("Add a product to cart.");
	}
	@Test(dependsOnMethods="addToCartTest")
	public void makePaymentTest() {
		System.out.println("Checkout from cart.");
	}
}
