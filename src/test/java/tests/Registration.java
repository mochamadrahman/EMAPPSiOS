package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.BaseClass;
import pages.SignInPage;
import pages.SignUpPage;

public class Registration extends BaseClass {

	@Test(priority = 1)
	public void RegisterFirstNameMaxLengthChar() {

		System.out.println("\n-------NegativeRegistration----------");
		System.out.println("\nStarting  firstNameMaxLengthChar test");
		
		SignInPage signinpage = new SignInPage(driver);
		signinpage.signup();
		
		SignUpPage signuppage = new SignUpPage(driver);
		assertTrue(signuppage.isSignUpHeaderDisplayed());

		signuppage.firstname("qwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvb");
		assertTrue(signuppage.ismaxLength50FirstNameDisplayed());

		System.out.println("firstNameMaxLengthChar Test successfully");
	}

	@Test(priority = 2)
	public void RegisterLastNameMaxLengthChar() {

		sleep(5000);
		
		System.out.println("\nStarting  laststNameMaxLengthChar test");
		
		SignUpPage signuppage = new SignUpPage(driver);
		
		signuppage.lastname("qwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvb");
		assertTrue(signuppage.ismaxLength50LastNameDisplayed());

		System.out.println("lastNameMaxLengthChar Test successfully");

	}

	@Test(priority = 3)
	public void RegisterInvalidEmailFormat() {

		System.out.println("\nStarting  invalidEmailFormat test");
		
		SignUpPage signuppage = new SignUpPage(driver);

		signuppage.email("1234addgmail.com");
		assertTrue(signuppage.isinvalidEmailFormatDisplayed());

		System.out.println("invalidEmailFormat Test successfully");

	}

	@Test(priority = 4)
	public void RegisterPasswordLess6Characters() {
		
		sleep(5000);
		
		System.out.println("\nStarting  passwordLess6Characters test");
		
		SignUpPage signuppage = new SignUpPage(driver);

		signuppage.password("12345");
		assertTrue(signuppage.isoutOfRangePasswordCharDisplayed());

		System.out.println("passwordLess6Characters Test successfully");

	}
	
	@Test(priority = 5)
	public void RegisterPasswordMore20Characters() {

		sleep(5000);
		
		System.out.println("\nStarting  passwordMore20Characters test");
		
		SignUpPage signuppage = new SignUpPage(driver);

		signuppage.password("1234567890123456789012");
		assertTrue(signuppage.isoutOfRangePasswordCharDisplayed());

		System.out.println("passwordMore20Characters Test successfully");
		System.out.println("\n");
		
		sleep(5000);

	}
	
	private void sleep(long m) {
		try {
			Thread.sleep(m);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
