package pages;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class CreateNewEventPage extends BaseClass {

	public CreateNewEventPage() {

	}

	public CreateNewEventPage(IOSDriver<IOSElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@iOSXCUITFindBy(id = "Event Organiser Name*")
	private IOSElement eventOrganizerName;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"iOSEmapps\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeTextField")
	private IOSElement eventOrganizerNameElement;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"iOSEmapps\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTextField")
	private IOSElement eventCategoryElement;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"iOSEmapps\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeTextField")
	private IOSElement eventTitleElement;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"iOSEmapps\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeTextView")
	private IOSElement eventDescriptionElement;

	@iOSXCUITFindBy(id = "upload_image")
	private IOSElement eventImageUploadElement;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"iOSEmapps\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[8]/XCUIElementTypeOther/XCUIElementTypeTextField[1]")
	private IOSElement eventStartDateElement;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"iOSEmapps\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[8]/XCUIElementTypeOther/XCUIElementTypeTextField[2]")
	private IOSElement eventStartTimeElement;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"iOSEmapps\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[9]/XCUIElementTypeOther/XCUIElementTypeTextField[1]")
	private IOSElement eventEndDateElement;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"iOSEmapps\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[9]/XCUIElementTypeOther/XCUIElementTypeTextField[2]")
	private IOSElement eventEndTimeElement;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"iOSEmapps\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[10]/XCUIElementTypeTextField")
	private IOSElement eventVenueAddressElement;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"iOSEmapps\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[13]/XCUIElementTypeTextField")
	private IOSElement eventUserInputElement;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"iOSEmapps\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[8]/XCUIElementTypeOther/XCUIElementTypeTextField[1]")
	private IOSElement fieldStartDateElement;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"iOSEmapps\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[8]/XCUIElementTypeOther/XCUIElementTypeTextField[2]")
	private IOSElement fieldStartTimeElement;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"iOSEmapps\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[9]/XCUIElementTypeOther/XCUIElementTypeTextField[1]")
	private IOSElement fieldEndtDateElement;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"iOSEmapps\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[9]/XCUIElementTypeOther/XCUIElementTypeTextField[2]")
	private IOSElement fieldEndTimeElement;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"iOSEmapps\"]/XCUIElementTypeWindow[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeDatePicker/XCUIElementTypeOther/XCUIElementTypePickerWheel[1]")
	private IOSElement monthPickerElement;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Publish\"]")
	private IOSElement eventPublishElement;

	@iOSXCUITFindBy(id = "Moments")
	private IOSElement momentsBundlePhotosElement;

	@iOSXCUITFindBy(id = "Photo, Landscape, August 09, 2012, 1:52 AM")
	private IOSElement pictureElement;

	@iOSXCUITFindBy(id = "Choose")
	private IOSElement chooseElement;

	@iOSXCUITFindBy(xpath = "///XCUIElementTypeApplication[@name=\"iOSEmapps\"]/XCUIElementTypeWindow[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypePicker/XCUIElementTypePickerWheel")
	private IOSElement pickerWheelEventCategoryElement;

	@iOSXCUITFindBy(id = "Toolbar Done Button")
	private IOSElement hideKeyboard;

	/**************************************/

	public boolean isEventOrganizerNameDisplayed() {
		return eventOrganizerName.isDisplayed();
	}

	public boolean isStartDateExist() {
		return fieldStartDateElement.isDisplayed();
	}

	public boolean isPublisButtonExist() {
		return eventPublishElement.isDisplayed();
	}

	public void clickEventOrganizerName() {
		eventOrganizerNameElement.click();
	}

	public void clickEventCategory() {
		eventCategoryElement.click();
	}

	public void clickEventTitle() {
		eventTitleElement.click();
	}

	public void clickEventDescription() {
		eventDescriptionElement.click();
	}

	public void clickEventImage() {
		eventImageUploadElement.click();
	}

	public void clickEventStartDate() {
		eventStartDateElement.click();
	}

	public void clickEventStartTime() {
		eventStartTimeElement.click();
	}

	public void clickEventEndDate() {
		eventEndDateElement.click();
	}

	public void clickEventEndTime() {
		eventEndTimeElement.click();
	}

	public void clickEventVenueAddress() {
		eventVenueAddressElement.click();
	}

	public void clickEventUserInput() {
		eventUserInputElement.click();
	}

	public void clickEventPublish() {
		eventPublishElement.click();
	}

	public void clickDoneButtonKeyboard() {
		hideKeyboard.click();
	}

	public void typeEventOrganizerName(String eventorganizername) {
		eventOrganizerNameElement.sendKeys(eventorganizername);
	}

	public void typeEventCategory(String eventcategory) {
		eventCategoryElement.sendKeys(eventcategory);
	}

	public void typeEventTitle(String eventtitle) {
		eventTitleElement.sendKeys(eventtitle);
	}

	public void typeEventDescription(String eventdescription) {
		eventDescriptionElement.sendKeys(eventdescription);
	}

	public void typeEventStartDate(String startdate) {
		eventStartDateElement.sendKeys(startdate);
	}

	public void typeEventStartTime(String starttime) {
		eventStartTimeElement.sendKeys(starttime);
	}

	public void typeEventEndDate(String enddate) {
		eventEndDateElement.sendKeys(enddate);
	}

	public void typeEventEndTime(String endtime) {
		eventEndTimeElement.sendKeys(endtime);
	}

	public void typeVenueAddress(String venueaddress) {
		eventVenueAddressElement.sendKeys(venueaddress);
	}

	public void typeUserInput(String userinput) {
		eventUserInputElement.sendKeys(userinput);
	}

	public void scrollEventCategoryElement() {
		WebElement picker = driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"iOSEmapps\"]/XCUIElementTypeWindow[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypePicker/XCUIElementTypePickerWheel");
		String name = picker.getAttribute("value");
		picker.sendKeys("Outside event");
		name = picker.getAttribute("value");
	}

	public void pickerwheelStep(IOSDriver<IOSElement> driver, WebElement element, String direction, double offset) {
		Map<String, Object> params = new HashMap<>();
		params.put("order", direction);
		params.put("offset", offset);
		params.put("element", ((RemoteWebElement) element).getId());
		driver.executeScript("mobile: selectPickerWheelValue", params);
	}

	/* Month Element of StartDate */
	public void startDateElement() {

		WebElement picker = driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"iOSEmapps\"]/XCUIElementTypeWindow[5]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeDatePicker/XCUIElementTypeOther/XCUIElementTypePickerWheel[1]");
		pickerwheelStep(driver, picker, "next", 0.15);
		pickerwheelStep(driver, picker, "previous", 0.15);

	}

	/* Hour Element of StartTime */
	public void startTimeElement() {

		WebElement picker = driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"iOSEmapps\"]/XCUIElementTypeWindow[5]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeDatePicker/XCUIElementTypeOther/XCUIElementTypePickerWheel[1]");
		pickerwheelStep(driver, picker, "next", 0.15);
		pickerwheelStep(driver, picker, "previous", 0.15);
	}

	/* Month Element of EndDate */
	public void endDateElement() {

		WebElement picker = driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"iOSEmapps\"]/XCUIElementTypeWindow[5]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeDatePicker/XCUIElementTypeOther/XCUIElementTypePickerWheel[1]");
		pickerwheelStep(driver, picker, "next", 0.15);
	}

	/* Hour Element of EndTime */
	public void endTimeElement() {

		WebElement picker = driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"iOSEmapps\"]/XCUIElementTypeWindow[5]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeDatePicker/XCUIElementTypeOther/XCUIElementTypePickerWheel[1]");
		pickerwheelStep(driver, picker, "next", 0.15);
	}

	public void swipePageUp() {
		Map<String, Object> args = new HashMap<String, Object>();
		args.put("direction", "up");
		driver.executeScript("mobile: swipe", args);
	}

	/**************************************/

	public void createNewEvent1(String eventorganizername, String eventtitle, String eventdescription, String venueaddress, String userinput) {

		clickEventOrganizerName();
		typeEventOrganizerName(eventorganizername);
		clickDoneButtonKeyboard();
		clickEventCategory();
		scrollEventCategoryElement();
		clickDoneButtonKeyboard();
		clickEventTitle();
		typeEventTitle(eventtitle);
		clickDoneButtonKeyboard();
		clickEventDescription();
		typeEventDescription(eventdescription);
		clickDoneButtonKeyboard();
		clickEventImage();
		momentsBundlePhotosElement.click();
		pictureElement.click();
		chooseElement.click();
		sleep(3000);
		swipePageUp();
		fieldStartDateElement.click();
		startDateElement();
		clickDoneButtonKeyboard();
		fieldStartTimeElement.click();
		startTimeElement();
		clickDoneButtonKeyboard();
		fieldEndtDateElement.click();
		endDateElement();
		clickDoneButtonKeyboard();
		fieldEndTimeElement.click();
		endTimeElement();
		clickDoneButtonKeyboard();
		clickEventVenueAddress();
		typeVenueAddress(venueaddress);
		clickDoneButtonKeyboard();
		swipePageUp();
		clickEventUserInput();
		typeUserInput(userinput);
		clickDoneButtonKeyboard();
		clickEventPublish();
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
