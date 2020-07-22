package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class SearchEventPage extends BaseClass {

	public SearchEventPage() {

	}

	public SearchEventPage(IOSDriver<IOSElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Search Event\"]")
	private IOSElement searchEventElement;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Back\"]")
	private IOSElement backButtonElement;
	
	@iOSXCUITFindBy(id = "No events available at the moment")
	private IOSElement noEventsAvailableElement;

	
	/**************************************/
	
	public boolean isNoEventsAvailableDisplay() {
		return noEventsAvailableElement.isEnabled();
	}

	
	}


