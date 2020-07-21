package pages;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class HomeScreenPage extends BaseClass {

	public HomeScreenPage() {

	}

	public HomeScreenPage(IOSDriver<IOSElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@iOSXCUITFindBy(id = "Home")
	private IOSElement homeElement;

	@iOSXCUITFindBy(id = "More")
	private IOSElement moreElement;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Login Successfuly!\"]")
	private IOSElement loginSuccessfuly;
	
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Yamaha NMAX Touring to Cibodas\"])[1]")
	private IOSElement eventTitle;
	
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Silaturahmi warga GrassLand\"])[1]")
	private IOSElement eventDescription;
	
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Cibodas, Puncak\"])[1]")
	private IOSElement venueAddress;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"iOSEmapps\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView")
	private IOSElement topCategories;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Outside event\"]")
	private IOSElement outsideEventElement;
	
	/*===================================*/

	public boolean isHomeDisplayed() {
		return homeElement.isDisplayed();
	}

	public boolean isloginSuccessfulyDisplayed() {
		return loginSuccessfuly.isDisplayed();
	}
	
	public boolean isEventTitleDisplayed() {
		return eventTitle.isDisplayed();
	}
	
	public boolean isEventDescriptionDisplayed() {
		return eventDescription.isDisplayed();
	}
	
	public boolean isVenueAddressDisplayed() {
		return venueAddress.isDisplayed();
	}

	public void profile() {
		moreElement.click();
	}
	
	public void clickHomeButton() {
		homeElement.click();
	}
	
	public void clickOutsideEvent() {
		outsideEventElement.click();
	}
	
	public void swipeLeft() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Map<String, Object> params = new HashMap<>();
		params.put("direction", "left");
		params.put("element", ((RemoteWebElement) topCategories).getId());
		js.executeScript("mobile: swipe", params);

	}
	
	public void swipeLeft1() {
		RemoteWebElement element = (RemoteWebElement)driver. findElement(By.xpath("//XCUIElementTypeApplication[@name=\"iOSEmapps\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView"));
		String elementID = element.getId();
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("element", elementID);
		scrollObject.put("name", "Outside event");
		driver.executeScript("mobile:scroll", scrollObject);
	}

	/*===================================*/
	
	public void clickMore() {

		profile();
	}

}
