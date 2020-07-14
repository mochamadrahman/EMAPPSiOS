package pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class MyEventPage extends BaseClass {

	public MyEventPage() {

	}

	public MyEventPage(IOSDriver<IOSElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@iOSXCUITFindBy(id = "+ New Event")
	private IOSElement createNewEventElement;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Back\"]")
	private IOSElement backButtonElement;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"Edit Event\"])[1]")
	private IOSElement editEventImunisasiBalitaElement;
	
	@iOSXCUITFindBy(id = "Create Event has successfully")
	private IOSElement notifSuccessCreateEventElement;
	
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Yamaha NMAX Touring to Cibodas\"])[1]")
	private IOSElement eventYamahaNMAXTouringElement;
	
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Cibodas, Puncak\"])[1]")
	private IOSElement cibodasPuncakElement;
	
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Honda Beat Touring to Bandung\"])[1]")
	private IOSElement eventHondaBeatTouringElement;
	
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Bandung, Dago\"])[1]")
	private IOSElement bandungDagoElement;
	
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"Edit Event\"])[1]")
	private IOSElement editEventElement;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Event Canceled\"]")
	private IOSElement eventCancelElement;

	/**************************************/

	public boolean isNewEventButtonkDisplayed() {
		return createNewEventElement.isDisplayed();
	}
	
	public boolean isEventYamahaNMAXTouringDisplayed() {
		return eventYamahaNMAXTouringElement.isDisplayed();
	}
	
	public boolean isCibodasPuncakDisplayed() {
		return cibodasPuncakElement.isDisplayed();
	}

	public boolean isEventHondaBeatTouringDisplayed() {
		return eventHondaBeatTouringElement.isDisplayed();
	}
	
	public boolean isBandungDagoDisplayed() {
		return bandungDagoElement.isDisplayed();
	}
	
	public boolean isEventCanceledDisplayed() {
		return eventCancelElement.isDisplayed();
	}
	
	public void clickNewEvent() {
		createNewEventElement.click();
	}
	
	public void clickBACK() {
		backButtonElement.click();
	}
	
	public void clickEditEvent() {
		editEventElement.click();
	}

	/**************************************/

	public void createNewEvent() {

		clickNewEvent();
	}

}
