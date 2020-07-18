package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;

import pages.BaseClass;
import pages.HomeScreenPage;
import pages.ProfilePage;
import pages.SignInPage;

public class LoginLogout extends BaseClass {

	public static ExtentTest parentTest;

	@Test(priority = 1)
	public void Login() {

		System.out.println("\n-------PositiveLogIn---------");
		System.out.println("\nStarting Login test");

		SignInPage signinpage = new SignInPage(driver);
		assertTrue(signinpage.isSignInPageDisplayed());

		signinpage.login("mrahmanh@gmail.com", "ccgl0618");

		HomeScreenPage homescreenpage = new HomeScreenPage(driver);
		assertTrue(homescreenpage.isHomeDisplayed());

		System.out.println("Login Test successfully");
		System.out.println("\n");

	}

	@Test(priority = 2)
	public void Logout() {

		sleep(5000);

		System.out.println("\n-------LogOut---------");
		System.out.println("\nStarting Logout test");

		HomeScreenPage homescreenpage = new HomeScreenPage(driver);

		homescreenpage.clickMore();

		ProfilePage profilepage = new ProfilePage(driver);
		assertTrue(profilepage.isWelcomeBackDisplayed());

		profilepage.clickSignOut();
		
		sleep(3000);

		SignInPage signinpage = new SignInPage(driver);
		assertTrue(signinpage.isSignInPageDisplayed());

		System.out.println("Logout Test successfully");
		System.out.println("\n");

	}

	@Test(priority = 3)
	public void LoginInvalidUsername() {

		sleep(5000);

		System.out.println("\n-------NegativeLogIn---------");
		System.out.println("\nStarting loginInvalidUsername test");

		SignInPage signinpage = new SignInPage(driver);
		assertTrue(signinpage.isSignInPageDisplayed());

		signinpage.login("mrahmanh1@gmail.com", "password1");
		assertTrue(signinpage.incorrectUserPassDisplayed());

		System.out.println("loginInvalidUsername test successfully");

	}

	@Test(priority = 5)
	public void LoginBlankUsername() {

		sleep(5000);

		System.out.println("\nStarting loginBlankUsername test");

		SignInPage signinpage = new SignInPage(driver);
		assertTrue(signinpage.isSignInPageDisplayed());
		
		signinpage.negatiflogin("", "ccgl0618");
		assertTrue(signinpage.blankUserPassDisplayed());

		System.out.println("loginBlankUsername test successfully");

	}

	@Test(priority = 4)
	public void LoginInvalidPassword() {

		sleep(5000);

		System.out.println("\nStarting loginInvalidPassword test");

		SignInPage signinpage = new SignInPage(driver);
		assertTrue(signinpage.isSignInPageDisplayed());

		signinpage.negatiflogin("emapps.mitrais@gmail.com", "password2");
		assertTrue(signinpage.incorrectUserPassDisplayed());

		System.out.println("loginInvalidPassword test successfully");

	}

	@Test(priority = 6)
	public void LoginBlankPassword() {

		sleep(5000);

		System.out.println("\nStarting loginBlankPassword test");

		SignInPage signinpage = new SignInPage(driver);
		assertTrue(signinpage.isSignInPageDisplayed());

		signinpage.negatiflogin1("mrahmanh@gmail.com", "");
		assertTrue(signinpage.blankUserPassDisplayed());

		System.out.println("loginBlankPassword test successfully");

	}

	@Test(priority = 7)
	public void LoginBlankUsernameAndPassword() {

		sleep(5000);

		System.out.println("\nStarting loginBlankUsernameAndPassword test");

		SignInPage signinpage = new SignInPage(driver);
		assertTrue(signinpage.isSignInPageDisplayed());

		signinpage.negatiflogin2("", "");
		assertTrue(signinpage.blankUserPassDisplayed());

		System.out.println("loginBlankUsernameAndPassword test successfully");
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
