package pages;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ForgotPasswordPage extends BaseClass {

	public ForgotPasswordPage() {

	}

	public ForgotPasswordPage(IOSDriver<IOSElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Forgot Password?\"]")
	private IOSElement forgotPasswordElement;

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeApplication[@name=\"iOSEmapps\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField")
	
	private IOSElement emailAddressElement;

	@iOSXCUITFindBy(id = "Submit")
	private IOSElement submitElement;
	
	@iOSXCUITFindBy(accessibility = "Back")
	private IOSElement backButtonElement;
	
	@iOSXCUITFindBy(id = "Email not valid")
	private IOSElement errorEmailnotvalidElement;
	
	@iOSXCUITFindBy(id = "Check your email for confirmation code")
	private IOSElement emailNotificationCodeElement;
	
	@iOSXCUITFindBy(id = "Toolbar Done Button")
	private IOSElement hideKeyboard;
	
//	@iOSXCUITFindBy(id = "Clear text")
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Clear text\"]")
	private IOSElement clearText;
	
	/**************************************/

	public boolean isForgotPasswordDisplayed() {
		return forgotPasswordElement.isDisplayed();
	}
	
	public boolean isErrorEmailnotvalidDisplayed( ) {
		return errorEmailnotvalidElement.isDisplayed();
	}
	
	public boolean isEmailNotificationCodeDisplayed( ) {
		return emailNotificationCodeElement.isDisplayed();
	}

	public void typeEmailAddress(String emailadress) {
		emailAddressElement.sendKeys(emailadress);
	}
	
	public void clickEmailAddress() {
		emailAddressElement.click();
	}
	
	public void clickSubmit() {
		submitElement.click();
	}
	
	public void clickBack() {
		backButtonElement.click();
	}
	
	public void clickDoneButtonKeyboard() {
		hideKeyboard.click();
	}
	
	public void clearText() {
		clearText.click();
	}
	
	/**************************************/

	public void submitEmailAddress(String emailadress) {
		
		typeEmailAddress(emailadress);
		clickDoneButtonKeyboard();
		clickSubmit();
	}
	
	public void ignoreSubmitEmail() {

		clickBack();
	}

}
