package tests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;

import pages.BaseClass;
import pages.EnterNewPasswordPage;
import pages.ForgotPasswordPage;
import pages.SignInPage;

public class ForgotAndNewPassword extends BaseClass {

	public static ExtentTest parentTest;

	@Test(priority = 1)
	public void queryConfirmationCode() {

		System.out.println("\n-------ForgotAndNewPasswordScenarioTest---------");

		SignInPage signinpage = new SignInPage(driver);
		assertTrue(signinpage.isSignInPageDisplayed());
		
		sleep(5000);
		
		System.out.println("\nStarting Query Confirmation Code Test");

		signinpage.clickForgotPassword();

		ForgotPasswordPage forgotpasspage = new ForgotPasswordPage(driver);
		assertTrue(forgotpasspage.isForgotPasswordDisplayed());

		forgotpasspage.submitEmailAddress("mrahmanh@gmail.com");
		assertTrue(forgotpasspage.isEmailNotificationCodeDisplayed());

		System.out.println("Query Confirmation Code Test successfully");
		System.out.println("\n");

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Forgot Password?")));

		EnterNewPasswordPage enternewpasspage = new EnterNewPasswordPage(driver);
		enternewpasspage.clickBack();

		forgotpasspage.clickEmailAddress();
		forgotpasspage.clearText();

	}

	@Test(priority = 2)
	public void invalidEmailAddress() {
		
		sleep(5000);

		System.out.println("Starting Invalid Email Address Test");
		
		ForgotPasswordPage forgotpasspage = new ForgotPasswordPage(driver);
		forgotpasspage.submitEmailAddress("mrahmanhaddgmail.com");
		
		assertTrue(forgotpasspage.isErrorEmailnotvalidDisplayed());

		System.out.println("Invalid Email Address Test successfully");
		System.out.println("\n");
		
		forgotpasspage.clickEmailAddress();
		forgotpasspage.clearText();
		forgotpasspage.submitEmailAddress("mrahmanh@gmail.com");
	}

	@Test(priority = 3)
	public void newPasswordLess6Chars() {
		
		sleep(5000);
		
		System.out.println("Starting New Password less 6 Chars Test");

		EnterNewPasswordPage enternewpasspage = new EnterNewPasswordPage(driver);
		enternewpasspage.newPassword("12345");
		
		assertTrue(enternewpasspage.isErrorCharactersPasswordDisplayed());

		System.out.println("New Password less 6 Chars Test successfully");
		System.out.println("\n");
		
		enternewpasspage.clickNewPassword();
		enternewpasspage.clickClearText();

	}

	@Test(priority = 4)
	public void newPasswordMore20Chars() {

		sleep(5000);
		System.out.println("Starting New Password more 20 Chars Test");

		EnterNewPasswordPage enternewpasspage = new EnterNewPasswordPage(driver);
		
		enternewpasspage.newPassword("123456789012345678901");
		assertTrue(enternewpasspage.isErrorCharactersPasswordDisplayed());

		System.out.println("New Password more 20 Chars Test successfully");
		System.out.println("\n");
		
		enternewpasspage.clickNewPassword();
		enternewpasspage.clickClearText();
	}

	@Test(priority = 5)
	public void invalidConfirmationCode() {

		sleep(5000);
		System.out.println("Starting Invalid Confirmation Code Test");

		EnterNewPasswordPage enternewpasspage = new EnterNewPasswordPage(driver);
		
		enternewpasspage.resetPassword("ccgl0618", "123456");
		
		assertTrue(enternewpasspage.isErrorConfCodeDisplayed());

		System.out.println("Invalid Confirmation Code Test successfully");
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
