package tests;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;

import pages.BaseClass;
import pages.HomeScreenPage;
import pages.ProfilePage;
import pages.SignInPage;
import pages.UpdateProfilePage;

public class UserProfile extends BaseClass {

	public static ExtentTest parentTest;

	@Test(priority = 1)
	public void checkAndValidateProfileData() {

		SignInPage signinpage = new SignInPage(driver);
		if (!signinpage.isSignInPageDisplayed()) {
			return;
		}

		sleep(3000);

		signinpage.login("mrahmanh@gmail.com", "ccgl0618");

		HomeScreenPage homescreenpage = new HomeScreenPage(driver);
		if (!homescreenpage.isloginSuccessfulyDisplayed()) {
			return;
		}

		sleep(3000);

		System.out.println("\n-------UserProfileScenarioTest---------");
		System.out.println("\nStarting Check And Validate ProfileData Test");

		homescreenpage.clickMore();

		ProfilePage profilepage = new ProfilePage(driver);
		if (!profilepage.isWelcomeBackDisplayed()) {
			return;
		}
		if (!profilepage.isProfileNameDisplayed()) {
			return;
		}
		if (!profilepage.isProfileEmailDisplayed()) {
			return;
		}
		if (!profilepage.isProfileAddressDisplayed()) {
			return;
		}
		if (!profilepage.isProfileGenderDisplayed()) {
			return;
		}
		if (!profilepage.isProfileDOBDisplayed()) {
			return;
		}
		if (!profilepage.isWelcomeBackDisplayed()) {
			return;
		}
		if (!profilepage.isWelcomeBackDisplayed()) {
			return;
		}

		sleep(3000);

		System.out.println("Check And Validate ProfileData Test successfully");
		System.out.println("\n");

		sleep(3000);

	}

	@Test(priority = 2)
	public void modifyProfileData() {

		ProfilePage profilepage = new ProfilePage(driver);
		profilepage.clickModifyProfile();

		System.out.println("Starting Modify ProfileData Test");

		sleep(3000);
		
		UpdateProfilePage updateprofilepage = new UpdateProfilePage(driver);
		if (!updateprofilepage.updateUserProfileDisplayed()) {
			return;
		}

		// swipe page up
		Map<String, Object> args = new HashMap<String, Object>();
		args.put("direction", "up");
		driver.executeScript("mobile: swipe", args);

		sleep(3000);

		if (!updateprofilepage.buttonEditProfileDisplayed()) {
			return;
		}

		updateprofilepage.modifyProfile("Azhar", "Fahlavi", "Bandung");

		sleep(3000);

		updateprofilepage.clickSaveProfile();
		if (!updateprofilepage.successUpdateProfileDisplayed()) {
			return;
		}

		sleep(3000);

		// swipe page down
		Map<String, Object> args1 = new HashMap<String, Object>();
		args1.put("direction", "down");
		driver.executeScript("mobile: swipe", args1);

		updateprofilepage.clickBackButton();

		System.out.println("Modify ProfileData Test successfully");
		System.out.println("\n");

		sleep(3000);

	}

	@Test(priority = 3)
	public void validateNEWProfileData() {

		System.out.println("Starting Validate NEW ProfileData Test");

		ProfilePage profilepage = new ProfilePage(driver);
		if (!profilepage.isProfileName1Displayed()) {
			return;
		}
		if (!profilepage.isProfileEmailDisplayed()) {
			return;
		}
		if (!profilepage.isProfileAddress1Displayed()) {
			return;
		}
		if (!profilepage.isProfileGenderDisplayed()) {
			return;
		}
		if (!profilepage.isProfileDOBDisplayed()) {
			return;
		}

		sleep(3000);

		System.out.println("Validate NEW ProfileData Test successfully");
		System.out.println("\n");

		sleep(5000);
	}

	@Test(priority = 4)
	public void modifyBackProfileData() {

		System.out.println("Starting Modify Back ProfileData Test");

		ProfilePage profilepage = new ProfilePage(driver);
		profilepage.clickModifyProfile();

		UpdateProfilePage updateprofilepage = new UpdateProfilePage(driver);
		if (!updateprofilepage.updateUserProfileDisplayed()) {
			return;
		}

		// swipe page up
		Map<String, Object> args = new HashMap<String, Object>();
		args.put("direction", "up");
		driver.executeScript("mobile: swipe", args);

		sleep(5000);

		if (!updateprofilepage.buttonEditProfileDisplayed()) {
			return;
		}

		updateprofilepage.modifyProfile("Moch", "Rahman", "Jakarta");

		sleep(5000);

		updateprofilepage.clickSaveProfile();
		if (!updateprofilepage.successUpdateProfileDisplayed()) {
			return;
		}

		sleep(5000);

		// swipe page down
		Map<String, Object> args1 = new HashMap<String, Object>();
		args1.put("direction", "down");
		driver.executeScript("mobile: swipe", args1);

		updateprofilepage.clickBackButton();

		System.out.println("Modify Back ProfileData Test successfully");
		System.out.println("\n");

		sleep(5000);

	}

	@Test(priority = 5)
	public void ignoreModifyProfileData() {

		System.out.println("Starting Ignore Modify ProfileData Test");

		ProfilePage profilepage = new ProfilePage(driver);
		profilepage.clickModifyProfile();

		UpdateProfilePage updateprofilepage = new UpdateProfilePage(driver);
		if (!updateprofilepage.updateUserProfileDisplayed()) {
			return;
		}

		// swipe page up
		Map<String, Object> args = new HashMap<String, Object>();
		args.put("direction", "up");
		driver.executeScript("mobile: swipe", args);

		sleep(5000);

		if (!updateprofilepage.buttonEditProfileDisplayed()) {
			return;
		}

		updateprofilepage.modifyProfile("Azhar", "Fahlavi", "Bandung");

		sleep(5000);

		// swipe page down
		Map<String, Object> args1 = new HashMap<String, Object>();
		args1.put("direction", "down");
		driver.executeScript("mobile: swipe", args1);

		updateprofilepage.clickBackButton();

		if (!profilepage.isWelcomeBackDisplayed()) {
			return;
		}
		if (!profilepage.isProfileNameDisplayed()) {
			return;
		}
		if (!profilepage.isProfileEmailDisplayed()) {
			return;
		}
		if (!profilepage.isProfileAddressDisplayed()) {
			return;
		}
		if (!profilepage.isProfileGenderDisplayed()) {
			return;
		}
		if (!profilepage.isProfileDOBDisplayed()) {
			return;
		}
		if (!profilepage.isWelcomeBackDisplayed()) {
			return;
		}
		if (!profilepage.isWelcomeBackDisplayed()) {
			return;
		}

		System.out.println("Ignore Modify ProfileData Test successfully");
		System.out.println("\n");

		sleep(5000);

	}

	@Test(priority = 6)
	public void checkMaxCharsProfileData() {

		System.out.println("Starting Check Max Characters ProfileData Test");

		ProfilePage profilepage = new ProfilePage(driver);
		profilepage.clickModifyProfile();

		UpdateProfilePage updateprofilepage = new UpdateProfilePage(driver);
		if (!updateprofilepage.updateUserProfileDisplayed()) {
			return;
		}

		// swipe page up
		Map<String, Object> args = new HashMap<String, Object>();
		args.put("direction", "up");
		driver.executeScript("mobile: swipe", args);

		sleep(5000);

		if (!updateprofilepage.buttonEditProfileDisplayed()) {
			return;
		}

		updateprofilepage.clickButtonEditProfile();

		updateprofilepage.maxCharFN("1234567890qwertyuiop1234567890qwertyuiop123456789012");
		if (!updateprofilepage.errorMaxCharFNDisplayed()) {
			return;
		}

		sleep(5000);

		updateprofilepage.maxCharLN("1234567890qwertyuiop1234567890qwertyuiop123456789012");
		if (!updateprofilepage.errorMaxCharLNDisplayed()) {
			return;
		}

		sleep(5000);

		updateprofilepage.maxCharHA("1234567890qwertyuiop1234567890qwertyuiop12345678901234567890qwertyuiop1234567890qwertyuiop123456789012");
		if (!updateprofilepage.errorMaxCharHADisplayed()) {
			return;
		}

		sleep(15000);

		updateprofilepage.clickSaveProfile();
		if (!updateprofilepage.errorPopUpMaxCharDisplayed()) {
			return;
		}

		sleep(5000);

		// swipe page down
		Map<String, Object> args1 = new HashMap<String, Object>();
		args1.put("direction", "down");
		driver.executeScript("mobile: swipe", args1);

		sleep(5000);

		updateprofilepage.clickBackButton();
		if (!profilepage.isWelcomeBackDisplayed()) {
			return;
		}

		profilepage.clickSignOut();

		SignInPage signinpage = new SignInPage(driver);
		if (!signinpage.isSignInPageDisplayed()) {
			return;
		}

		sleep(5000);

		System.out.println("Check Max Characters ProfileData Test successfully");
		System.out.println("\n");

		sleep(3000);

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
