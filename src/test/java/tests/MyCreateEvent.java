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

public class MyCreateEvent extends BaseClass {

	public static ExtentTest parentTest;

	@Test(priority = 1)
	public void createEvent() {

		SignInPage signinpage = new SignInPage(driver);
		assertTrue(signinpage.isSignInPageDisplayed());
		sleep(3000);
		signinpage.login("mrahmanh@gmail.com", "ccgl0618");

		HomeScreenPage homescreenpage = new HomeScreenPage(driver);
		assertTrue(homescreenpage.isHomeDisplayed());

		sleep(3000);

		System.out.println("\n-------MyCreateEventTest---------");
		System.out.println("\nStarting Create New Event Test");

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
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeButton[@name=\"Back\"]")))
				.click();

		System.out.println("Create New Event Test successfully");
		System.out.println("\n");

		sleep(3000);

		assertTrue(profilepage.isWelcomeBackDisplayed());

		sleep(3000);
	}

	@Test(priority = 2)
	public void readEvent() {

		System.out.println("Starting Read Event Test");

		ProfilePage profilepage = new ProfilePage(driver);
		profilepage.clickMyEvent();

		MyEventPage myeventpage = new MyEventPage(driver);
		assertTrue(myeventpage.isEventYamahaNMAXTouringDisplayed(), "Event Yamaha NMAX Touring NOT Exist");
		assertTrue(myeventpage.isCibodasPuncakDisplayed(), "Location Cibodas Puncak NOT Exist");

		sleep(3000);

		System.out.println("Read Event Test successfully");
		System.out.println("\n");

	}

	@Test(priority = 3)
	public void updateEvent() {

		sleep(3000);

		System.out.println("Starting Update Event Test");

		MyEventPage myeventpage = new MyEventPage(driver);
		myeventpage.clickEditEvent();

		sleep(3000);

		WebDriverWait wait1 = new WebDriverWait(driver, 30);

		/* Update Event Title */
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//XCUIElementTypeApplication[@name=\"iOSEmapps\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeTextField")))
				.clear();
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//XCUIElementTypeApplication[@name=\"iOSEmapps\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeTextField")))
				.sendKeys("Honda Beat Touring to Bandung");

		Map<String, Object> args = new HashMap<String, Object>();
		args.put("direction", "up");
		driver.executeScript("mobile: swipe", args);

		/* Update Venue Address */
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//XCUIElementTypeApplication[@name=\"iOSEmapps\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[10]/XCUIElementTypeTextField")))
				.clear();
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//XCUIElementTypeApplication[@name=\"iOSEmapps\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[10]/XCUIElementTypeTextField")))
				.sendKeys("Bandung, Dago");

		sleep(3000);
		Map<String, Object> args1 = new HashMap<String, Object>();
		args1.put("direction", "up");
		driver.executeScript("mobile: swipe", args1);

		/* Update User Input */
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//XCUIElementTypeApplication[@name=\"iOSEmapps\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[13]/XCUIElementTypeTextField")))
				.click();
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//XCUIElementTypeApplication[@name=\"iOSEmapps\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[13]/XCUIElementTypeTextField")))
				.sendKeys("Coffee");

		/* Hide Keyboard */
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("Toolbar Done Button"))).click();

		/* Button Update be clicked */
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("Update Event"))).click();

		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("Update Event has successfully")));

		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeButton[@name=\"Back\"]")))
				.click();

		sleep(3000);

		ProfilePage profilepage = new ProfilePage(driver);
		profilepage.clickMyEvent();

		assertTrue(myeventpage.isEventHondaBeatTouringDisplayed(), "Event Honda Beat Touring NOT Exist");
		assertTrue(myeventpage.isBandungDagoDisplayed(), "Location Bandung Dago NOT Exist");

		sleep(10000);

		System.out.println("Update Event Test successfully");
		System.out.println("\n");

	}

	@Test(priority = 4)
	public void cancelEvent() {

		sleep(3000);

		System.out.println("Starting Cancel Event Test");

		MyEventPage myeventpage = new MyEventPage(driver);
		myeventpage.clickEditEvent();

		sleep(3000);

		WebDriverWait wait1 = new WebDriverWait(driver, 30);

		Map<String, Object> args = new HashMap<String, Object>();
		args.put("direction", "up");
		driver.executeScript("mobile: swipe", args);

		sleep(3000);
		Map<String, Object> args1 = new HashMap<String, Object>();
		args1.put("direction", "up");
		driver.executeScript("mobile: swipe", args1);

		
		sleep(3000);
		Map<String, Object> args2 = new HashMap<String, Object>();
		args2.put("direction", "up");
		driver.executeScript("mobile: swipe", args2);

		/* Button Cancel Event */
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("Cancel Event"))).click();

		/* Button Yes Confirmation Cancel */
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("Yes"))).click();

		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("Cancel Event has successfully")));

		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeButton[@name=\"Back\"]")))
				.click();

		sleep(3000);

		ProfilePage profilepage = new ProfilePage(driver);
		profilepage.clickMyEvent();

		assertTrue(myeventpage.isEventCanceledDisplayed(), "Event Cancel NOT Exist");

		sleep(10000);

		System.out.println("Cancel Event Test successfully");
		System.out.println("\n");

		/* Sign Out from App */

//		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeButton[@name=\"Back\"]")))
				.click();

		sleep(3000);
		profilepage.clickSignOut();


		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("You've successfully logged out")));

		sleep(3000);

		/* Sign Out from App */

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
