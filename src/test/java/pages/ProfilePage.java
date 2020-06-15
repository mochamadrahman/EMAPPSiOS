package pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ProfilePage extends BaseClass {

	public ProfilePage() {

	}

	public ProfilePage(IOSDriver<IOSElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@iOSXCUITFindBy(id = "Welcome Back,")
	private IOSElement welcomeBackElement;

	@iOSXCUITFindBy(id = "Moch Rahman")
	private IOSElement profileNameElement;

	@iOSXCUITFindBy(id = "Azhar Fahlavi")
	private IOSElement profileName1Element;

	@iOSXCUITFindBy(id = "mrahmanh@gmail.com")
	private IOSElement profileEmailElement;

	@iOSXCUITFindBy(id = "Jakarta")
	private IOSElement profileAddressElement;

	@iOSXCUITFindBy(id = "Bandung")
	private IOSElement profileAddress1Element;

	@iOSXCUITFindBy(id = "Male")
	private IOSElement profileGenderElement;

	@iOSXCUITFindBy(id = "29-05-2010")
	private IOSElement profileDOBElement;

	@iOSXCUITFindBy(className = "Password")
	private IOSElement passwordProfileElement;

//	@iOSXCUITFindBy(id = "piper")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"iOSEmapps\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther")
	private IOSElement buttonModifyProfileElement;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"iOSEmapps\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther")
	private IOSElement buttonModifyProfileElement1;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Sign Out\"]")
	private IOSElement signoutElement;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Password\"]")
	private IOSElement passwordElement;

	/**************************************/

	public boolean isWelcomeBackDisplayed() {
		return welcomeBackElement.isDisplayed();
	}

	public boolean isProfileNameDisplayed() {
		return profileNameElement.isDisplayed();
	}

	public boolean isProfileName1Displayed() {
		return profileName1Element.isDisplayed();
	}

	public boolean isProfileEmailDisplayed() {
		return profileEmailElement.isDisplayed();
	}

	public boolean isProfileAddressDisplayed() {
		return profileAddressElement.isDisplayed();
	}

	public boolean isProfileAddress1Displayed() {
		return profileAddress1Element.isDisplayed();
	}

	public boolean isProfileGenderDisplayed() {
		return profileGenderElement.isDisplayed();
	}

	public boolean isProfileDOBDisplayed() {
		return profileDOBElement.isDisplayed();
	}

	public void clickSignOut() {
		signoutElement.click();
	}

	public void clickPasswordChange() {
		passwordElement.click();
	}

	public void clickModifyProfile() {
		buttonModifyProfileElement.click();
	}

	public void clickModifyProfile1() {
		buttonModifyProfileElement1.click();
	}

	/**************************************/

	public void logout() {

		clickSignOut();
	}

	public void password() {

		clickPasswordChange();
	}

}
