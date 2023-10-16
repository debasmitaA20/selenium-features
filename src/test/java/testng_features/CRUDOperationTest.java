package testng_features;

import org.testng.annotations.Test;

public class CRUDOperationTest {

	public void createUser() {
		System.out.println("Create user..");
	}
	public void retrieveUser() {
		System.out.println("Retrieve user..");
	}
	public void updateUser() {
		System.out.println("Update user..");
	}
	public void deleteUser() {
		System.out.println("Delete user..");
	}
	
	
	@Test
	public void createUserTest() {
		createUser();
	}
	@Test
	public void retrieveUserTest() {
		createUser();
		retrieveUser();//validate - user should be available
	}
	@Test
	public void updateUserTest() {
		createUser();
		retrieveUser();
		updateUser();
		retrieveUser(); //validate - user details should be updated
	}
	@Test
	public void deleteUserTest() {
		createUser(); //post
		retrieveUser(); //get
		deleteUser(); //delete
		retrieveUser();	//validate	- user shouldn't be available
	}
}

//no test should be dependent on the other. All thread execution will be independent.