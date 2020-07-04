package pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class MyCreateEventPage extends BaseClass {

	public MyCreateEventPage() {

	}

	public MyCreateEventPage(IOSDriver<IOSElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@iOSXCUITFindBy(id = "+ New Event")
	private IOSElement createNewEventElement;
	
	@iOSXCUITFindBy(id = "Imunisasi Balita")
	private IOSElement eventImunisasiElement;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"Edit Event\"])[1]")
	private IOSElement editEventImunisasiBalitaElement;
	
	

	/**************************************/

	public boolean isNewEventButtonkDisplayed() {
		return createNewEventElement.isDisplayed();
	}
	
	public boolean isImunisasiBalitaDisplayed() {
		return eventImunisasiElement.isDisplayed();
	}

	public void clickNewEvent() {
		createNewEventElement.click();
	}
	
	public void clickEditEventImunisasiBalita() {
		editEventImunisasiBalitaElement.click();
	}

	/**************************************/

	public void createNewEvent() {

		clickNewEvent();
	}

}
