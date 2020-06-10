package pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class EnterNewPasswordPage extends BaseClass {

	public EnterNewPasswordPage() {

	}

	public EnterNewPasswordPage(IOSDriver<IOSElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@iOSXCUITFindBy(className = "Enter New Password")
	private IOSElement enterNewPasswordElement;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"iOSEmapps\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeSecureTextField")
	private IOSElement newPasswordElement;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"iOSEmapps\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeTextField")
	private IOSElement confirmationCodeElement;

	@iOSXCUITFindBy(id = "Reset Password")
	private IOSElement resetPasswordElement;

	@iOSXCUITFindBy(id = "Forgot Password?")
	private IOSElement backButton1Element;

	@iOSXCUITFindBy(id = "Error: Password must consist of 6-20 characters")
	private IOSElement errorCharactersPasswordElement;
	
	@iOSXCUITFindBy(id = "Failed to process")
	private IOSElement errorInvalidConfCodeElement;

	@iOSXCUITFindBy(xpath = "(//XCUIElementTypeButton[@name=\"Clear text\"])[1]")
	private IOSElement clearTextElement;

	@iOSXCUITFindBy(id = "Toolbar Done Button")
	private IOSElement hideKeyboard;
	

	/**************************************/

	public boolean isEnterNewPasswordDisplayed() {
		return enterNewPasswordElement.isDisplayed();
	}

	public boolean isErrorCharactersPasswordDisplayed() {
		return errorCharactersPasswordElement.isDisplayed();
	}
	
	public boolean isErrorConfCodeDisplayed() {
		return errorInvalidConfCodeElement.isDisplayed();
	}

	public void typeNewPassword(String newpassword) {
		newPasswordElement.sendKeys(newpassword);
	}

	public void typeConfCode(String confcode) {
		confirmationCodeElement.sendKeys(confcode);
	}
	
	public void clickNewPassword() {
		errorCharactersPasswordElement.click();
	}

	public void clickResetPassword() {
		resetPasswordElement.click();
	}

	public void clickBack() {
		backButton1Element.click();
	}

	public void clickDoneButtonKeyboard() {
		hideKeyboard.click();
	}
	
	public void clickClearText() {
		clearTextElement.click();
	}

	/**************************************/

	public void newPassword(String newpassword) {

		typeNewPassword(newpassword);
		clickDoneButtonKeyboard();
		clickResetPassword();
	}

	public void resetPassword(String newpassword, String confcode) {

		typeNewPassword(newpassword);
		clickDoneButtonKeyboard();
		typeConfCode(confcode);
		clickDoneButtonKeyboard();
		clickResetPassword();
	}

	public void ignoreResetPassword() {

		clickBack();
	}

}
