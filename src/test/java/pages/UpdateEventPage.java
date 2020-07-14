package pages;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class UpdateEventPage extends BaseClass {

	public UpdateEventPage() {

	}

	public UpdateEventPage(IOSDriver<IOSElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Event Title*\"]")
	private IOSElement eventTitleElement;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"iOSEmapps\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeTextField")
	private IOSElement eventTitleFieldTabElement;

	@iOSXCUITFindBy(id = "Toolbar Done Button")
	private IOSElement hideKeyboard;

	/**************************************/

	public boolean isEventTitleExist() {
		return eventTitleElement.isDisplayed();
	}

	public boolean isTitleFieldElementExist() {
		return eventTitleFieldTabElement.isDisplayed();
	}

	public void clearEventTitle() {
		eventTitleFieldTabElement.clear();
	}

	public void typeEventTitle(String eventtitle) {
		eventTitleElement.sendKeys(eventtitle);
	}

	public void swipePageUp() {
		Map<String, Object> args = new HashMap<String, Object>();
		args.put("direction", "up");
		driver.executeScript("mobile: swipe", args);
	}

	public void clickDoneButtonKeyboard() {
		hideKeyboard.click();
	}

	/**************************************/

	public void updateEvent() {

		swipePageUp();
		swipePageUp();

	}

}
