package pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class CreateEventPage extends BaseClass {

	public CreateEventPage() {

	}

	public CreateEventPage(IOSDriver<IOSElement> driver) {
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
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"iOSEmapps\"]/XCUIElementTypeWindow[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypePicker/XCUIElementTypePickerWheel/XCUIElementTypeOther[3]")
	private IOSElement outsideEventElement;
	

	@iOSXCUITFindBy(id = "Publish")
	private IOSElement eventPublishElement;
	
	@iOSXCUITFindBy(id = "Moments")
	private IOSElement momentsBundlePhotosElement;

	@iOSXCUITFindBy(id = "Photo, Landscape, August 09, 2012, 1:52 AM")
	private IOSElement pictureElement;

	@iOSXCUITFindBy(id = "Choose")
	private IOSElement chooseElement;

	


	@iOSXCUITFindBy(id = "Toolbar Done Button")
	private IOSElement hideKeyboard;

	/**************************************/

	public boolean isEventOrganizerNameDisplayed() {
		return eventOrganizerName.isDisplayed();
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
	
	public void chooseOutsideEvent() {
		outsideEventElement.click();
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
		eventVenueAddressElement.sendKeys(userinput);
	}
	
	public void scrollEventCategoryElement() {
		
	}

	/**************************************/

	public void createNewEvent1(String eventorganizername, String eventcategory, String eventtitle, String eventdescription) {

		clickEventOrganizerName();
		typeEventOrganizerName(eventorganizername);
		clickDoneButtonKeyboard();
		clickEventCategory();
		chooseOutsideEvent();
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
		}
	
	public void createNewEvent2(String startdate, String starttime, String enddate, String endtime, String venueaddress, String userinput) {

		clickEventStartDate();
		typeEventStartDate(startdate);
		clickDoneButtonKeyboard();
		clickEventStartTime();
		typeEventStartTime(starttime);
		clickDoneButtonKeyboard();
		clickEventEndDate();
		typeEventEndDate(enddate);
		clickDoneButtonKeyboard();
		clickEventVenueAddress();
		typeVenueAddress(venueaddress);
		clickDoneButtonKeyboard();
		clickEventUserInput();
		typeUserInput(userinput);
		clickDoneButtonKeyboard();
		clickEventPublish();
		
		}

}
