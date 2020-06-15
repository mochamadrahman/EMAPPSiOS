package pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class UpdateProfilePage extends BaseClass {

	public UpdateProfilePage() {

	}

	public UpdateProfilePage(IOSDriver<IOSElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@iOSXCUITFindBy(accessibility = "USER PROFILE")
	private IOSElement userProfileElement;

	@iOSXCUITFindBy(accessibility = "Edit Profile")
//	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"iOSEmapps\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[7]")
	private IOSElement buttonEditProfileElement;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"iOSEmapps\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[1]")
	private IOSElement firstNameElement;
	

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"iOSEmapps\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[2]")
	private IOSElement lastNameElement;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"iOSEmapps\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[4]")
	private IOSElement genderElement;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"iOSEmapps\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[5]")
	private IOSElement homeAddressElement;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"iOSEmapps\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeTextField[6]")
	private IOSElement bODElement;
	
	@iOSXCUITFindBy(id = "Toolbar Done Button")
	private IOSElement hideKeyboard;
	
	@iOSXCUITFindBy(accessibility = "Save Profile")
//	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"iOSEmapps\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[7]")
	private IOSElement buttonSaveProfileElement;
	
//	@iOSXCUITFindBy(accessibility = "back_button")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"iOSEmapps\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther")
	private IOSElement backButtonElement;
	
	@iOSXCUITFindBy(id = "Update Profile Successfully!")
	private IOSElement successUpdateProfilenElement;
	
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Maximum length is 50\"])[1]")
	private IOSElement maxCharFNElement;
	
	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeStaticText[@name=\"Maximum length is 50\"])[2]")
	private IOSElement maxCharLNElement;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Maximum length is 100\"]")
	private IOSElement maxCharHAElement;
	
	@iOSXCUITFindBy(accessibility = "Please re-check again warning alert on input text")
	private IOSElement errorPopUpMaxCharElement;
	
	/**************************************/

	public boolean updateUserProfileDisplayed() {
		return userProfileElement.isDisplayed();
	}
	
	public boolean buttonEditProfileDisplayed() {
		return buttonEditProfileElement.isDisplayed();
	}
	
	public boolean successUpdateProfileDisplayed() {
		return successUpdateProfilenElement.isDisplayed();
	}
	
	public boolean errorMaxCharFNDisplayed() {
		return maxCharFNElement.isDisplayed();
	}
	
	public boolean errorMaxCharLNDisplayed() {
		return maxCharLNElement.isDisplayed();
	}
	
	public boolean errorMaxCharHADisplayed() {
		return maxCharHAElement.isDisplayed();
	}
	
	public boolean errorPopUpMaxCharDisplayed() {
		return errorPopUpMaxCharElement.isDisplayed();
	}
	
	public void clearFirstName() {
		firstNameElement.clear();
	}
	
	public void clickFirstName() {
		firstNameElement.click();
	}
	
	public void clearLastName() {
		lastNameElement.clear();
	}
	
	public void clickLastName() {
		lastNameElement.click();
	}
	
	public void clearGender() {
		genderElement.clear();
	}
	
	public void clearHomeAddress() {
		homeAddressElement.clear();
	}
	
	public void clickHomeAddress() {
		homeAddressElement.click();
	}
	
	public void clearBOD() {
		bODElement.clear();
	}
	
	public void typeFirstName(String firstname) {
		firstNameElement.sendKeys(firstname);
	}
	
	public void typeLastName(String lastname) {
		lastNameElement.sendKeys(lastname);
	}
	
	public void typeGender(String gender) {
		genderElement.sendKeys(gender);
	}
	
	public void typeHomeAddress(String homeaddress) {
		homeAddressElement.sendKeys(homeaddress);
	}
	
	public void typeBOD(String bod) {
		bODElement.sendKeys(bod);
	}

	public void clickButtonEditProfile() {
		buttonEditProfileElement.click();
	}
	
	public void clickSaveProfile() {
		buttonSaveProfileElement.click();
	}
	
	public void clickBackButton() {
		backButtonElement.click();
	}
	
	public void clickDoneButtonKeyboard() {
		hideKeyboard.click();
	}
	
	/**************************************/

	public void modifyProfile(String firstname, String lastname, String homeaddress) {

		clickButtonEditProfile();
		sleep(1000);
		clearFirstName();
		typeFirstName(firstname);
		clickDoneButtonKeyboard();
		sleep(1000);
		clearLastName();
		typeLastName(lastname);
		clickDoneButtonKeyboard();
		sleep(1000);
		clearHomeAddress();
		typeHomeAddress(homeaddress);
		clickDoneButtonKeyboard();
	}
	
	public void maxCharFN(String firstname) {

		sleep(1000);
		clearFirstName();
		typeFirstName(firstname);
		clickDoneButtonKeyboard();
		clickLastName();
	}
	
	public void maxCharLN(String lastname) {

		sleep(1000);
		clearLastName();
		typeLastName(lastname);
		clickDoneButtonKeyboard();
		clickHomeAddress();
	}
	
	public void maxCharHA(String homeaddress) {

		sleep(1000);
		clearHomeAddress();
		typeHomeAddress(homeaddress);
		clickDoneButtonKeyboard();
	}
	
	public void saveUpdateProfile() {

		clickSaveProfile();
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
