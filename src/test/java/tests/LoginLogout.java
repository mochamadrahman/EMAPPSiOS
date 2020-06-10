package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
		if (!signinpage.isSignInPageDisplayed()) {
			return;
		}
		
		signinpage.login("mrahmanh@gmail.com", "ccgl0618");
		
		
		HomeScreenPage homescreenpage = new HomeScreenPage(driver);
		if (!homescreenpage.isloginSuccessfulyDisplayed()) {
			return;
		}
		
		System.out.println("Login Test successfully");
		System.out.println("\n");

	}
	
	@Test(priority = 2)
	public void Logout() {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n-------LogOut---------");
		System.out.println("\nStarting Logout test");
		
		HomeScreenPage homescreenpage = new HomeScreenPage(driver);
		
		/* This Waiting time just want to sure element Favorites can be identified by appium */
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Favorites")));
		
		if (!homescreenpage.isFavoritesDisplayed()) {
			return;
		}

		homescreenpage.clickMore();

		ProfilePage profilepage = new ProfilePage(driver);
		if (!profilepage.isWelcomeBackDisplayed()) {
			return;
		}

		profilepage.clickSignOut();
		
		SignInPage signinpage = new SignInPage(driver);
		if (!signinpage.isSignInPageDisplayed()) {
			return;
		}

		System.out.println("Logout Test successfully");
		System.out.println("\n");

	}
	
	@Test(priority = 3)
	public void LoginInvalidUsername() {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\n-------NegativeLogIn---------");
		System.out.println("\nStarting loginInvalidUsername test");
		
		SignInPage signinpage = new SignInPage(driver);
		if (!signinpage.isSignInPageDisplayed()) {
			return;
		}

		signinpage.login("mrahmanh1@gmail.com", "password1");
		if (!signinpage.incorrectUserPassDisplayed()) {
			return;
		}

		System.out.println("loginInvalidUsername test successfully");

	}

	@Test(priority = 5)
	public void LoginBlankUsername() {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\nStarting loginBlankUsername test");
		
		SignInPage signinpage = new SignInPage(driver);
		if (!signinpage.isSignInPageDisplayed()) {
			return;
		}

		signinpage.negatiflogin("", "ccgl0618");
		if (!signinpage.blankUserPassDisplayed()) {
			return;
		}

		System.out.println("loginBlankUsername test successfully");

	}

	@Test(priority = 4)
	public void LoginInvalidPassword() {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\nStarting loginInvalidPassword test");
		
		SignInPage signinpage = new SignInPage(driver);
		if (!signinpage.isSignInPageDisplayed()) {
			return;
		}

		signinpage.negatiflogin("emapps.mitrais@gmail.com", "password2");
		if (!signinpage.incorrectUserPassDisplayed()) {
			return;
		}

		System.out.println("loginInvalidPassword test successfully");

	}

	@Test(priority = 6)
	public void LoginBlankPassword() {
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\nStarting loginBlankPassword test");
		
		SignInPage signinpage = new SignInPage(driver);
		if (!signinpage.isSignInPageDisplayed()) {
			return;
		}
		
		
		signinpage.negatiflogin1("mrahmanh@gmail.com", "");
		if (!signinpage.blankUserPassDisplayed()) {
			return;
		}

		System.out.println("loginBlankPassword test successfully");

	}

	@Test(priority = 7)
	public void LoginBlankUsernameAndPassword() {
	
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("\nStarting loginBlankUsernameAndPassword test");
		
		SignInPage signinpage = new SignInPage(driver);
		if (!signinpage.isSignInPageDisplayed()) {
			return;
		}

		signinpage.negatiflogin2("", "");
		if (!signinpage.blankUserPassDisplayed()) {
			return;
		}

		System.out.println("loginBlankUsernameAndPassword test successfully");
		System.out.println("\n");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

