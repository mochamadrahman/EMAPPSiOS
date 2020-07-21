

package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentTest;

import pages.BaseClass;
import pages.CreateNewEventPage;
import pages.HomeScreenPage;
import pages.MyEventPage;
import pages.ProfilePage;
import pages.SignInPage;
import pages.UpdateEventPage;

public class BrowseUpcomingEvent extends BaseClass {

	public static ExtentTest parentTest;

	@Test(priority = 1)
	public void browseEventAllCategories() {

		SignInPage signinpage = new SignInPage(driver);
		assertTrue(signinpage.isSignInPageDisplayed());
		sleep(3000);
		signinpage.login("mrahmanh@gmail.com", "ccgl0618");

		HomeScreenPage homescreenpage = new HomeScreenPage(driver);
		assertTrue(homescreenpage.isHomeDisplayed());

		sleep(3000);

		homescreenpage.clickMore();

		ProfilePage profilepage = new ProfilePage(driver);
		profilepage.clickMyEvent();

		MyEventPage myeventpage = new MyEventPage(driver);
		assertTrue(myeventpage.isNewEventButtonkDisplayed());
		myeventpage.clickNewEvent();

		CreateNewEventPage createeventpage = new CreateNewEventPage(driver);
		assertTrue(createeventpage.isEventOrganizerNameDisplayed());
		createeventpage.createNewEvent1("GrassLanders", "Yamaha NMAX Touring to Cibodas", "Silaturahmi warga GrassLand",
				"Cibodas, Puncak", "Coffee");

		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Create Event has successfully")));

		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeButton[@name=\"Back\"]"))).click();
		
		sleep(3000);
		
		profilepage.clickSignOut();
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("You've successfully logged out")));
		assertTrue(signinpage.isSignInPageDisplayed());
		signinpage.login("mrahmanh@gmail.com", "ccgl0618");
		
		
		System.out.println("\n-------BrowseUpcomingEventTest---------");
		System.out.println("\nStarting Check Event in Dashboard Panel (All Categories) Test");

		assertTrue(homescreenpage.isEventTitleDisplayed());
		assertTrue(homescreenpage.isEventDescriptionDisplayed());
		assertTrue(homescreenpage.isVenueAddressDisplayed());

		System.out.println("Check Event in Dashboard Panel (All Categories) Test successfully");
		System.out.println("\n");
		
		/* ***** Sign Out from App ***** */

//		homescreenpage.clickMore();
//		
//		sleep(3000);
//		
//		profilepage.clickSignOut();
//		
//		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("You've successfully logged out")));
//
//
//		assertTrue(signinpage.isSignInPageDisplayed());
//
//		sleep(10000);

		/* ***** Sign Out from App ***** */

	}

	@Test(priority = 2)
	public void browseEventSpecificCategory() {

		System.out.println("Starting Check Event in Specific Category Test");
		
		HomeScreenPage homescreenpage = new HomeScreenPage(driver);
		assertTrue(homescreenpage.isHomeDisplayed());
		
		homescreenpage.clickOutsideEvent();
		
		sleep(3000);
		
		assertTrue(homescreenpage.isEventTitleDisplayed());
		assertTrue(homescreenpage.isEventDescriptionDisplayed());
		assertTrue(homescreenpage.isVenueAddressDisplayed());

		sleep(3000);

		System.out.println("Check Event in Specific Category successfully");
		System.out.println("\n");

		ProfilePage profilepage = new ProfilePage(driver);
		WebDriverWait wait1 = new WebDriverWait(driver, 60);
		

		/* ***** Sign Out from App ***** */

		homescreenpage.clickMore();
		
		sleep(3000);
		
		profilepage.clickSignOut();
		
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("You've successfully logged out")));
		
		sleep(10000);
		
		/* ***** Sign Out from App ***** */

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
